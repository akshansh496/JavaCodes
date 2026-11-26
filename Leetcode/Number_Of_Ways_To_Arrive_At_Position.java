package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Number_Of_Ways_To_Arrive_At_Position {

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

    static class Pair implements Comparable<Pair> {

        int n;
        long dist;

        Pair(int n, long dist) {
            this.n = n;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p2) {
            return Long.compare(this.dist, p2.dist);
        }
    }

    public static int countPaths(int n, int[][] roads) {
        int MOD = 1000000007;
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < roads.length; i++) {
            int u = roads[i][0];
            int v = roads[i][1];
            int wt = roads[i][2];
            graph[u].add(new Edge(u, v, wt));
            graph[v].add(new Edge(v, u, wt));
        }
        long dist[] = new long[n];
        int ways[] = new int[n];
        boolean vis[] = new boolean[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        ways[0] = 1;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if (dist[u] + wt == dist[v]) {
                        ways[v] = (ways[v] + ways[u]) % MOD;
                    }
                    if (dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                        ways[v] = ways[u];
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        return ways[n - 1];
    }

    public static void main(String[] args) {
        int[][] roads = {{0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3}, {3, 5, 1}, {6, 5, 1}, {2, 5, 1}, {0, 4, 5}, {4, 6, 2}};
        System.out.println(countPaths(7, roads));
    }

}
