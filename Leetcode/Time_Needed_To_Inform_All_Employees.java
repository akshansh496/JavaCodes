package Leetcode;

import java.util.ArrayList;

public class Time_Needed_To_Inform_All_Employees {

    static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static int max = Integer.MIN_VALUE;

    public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                int src = manager[i];
                int dest = i;
                int wt = informTime[src];
                graph[src].add(new Edge(src, dest, wt));
            }
        }
        dfs(graph, headID, 0);
        return max;
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, int mins) {
        max = Math.max(max, mins);
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            dfs(graph, e.dest, mins + e.wt);

        }
    }

    public static void main(String[] args) {
        int n = 6;
        int headID = 2;
        int manager[] = {2, 2, -1, 2, 2, 2};
        int informTime[] = {0, 0, 1, 0, 0, 0};
        System.out.println(numOfMinutes(n, headID, manager, informTime));
    }
}
