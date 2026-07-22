package Flipkart_Grid_Practice;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Network_Delay_Time {
    class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    class Pair implements Comparable<Pair> {
        int n;
        int dist;

        public Pair(int n, int dist) {
            this.n = n;
            this.dist = dist;
        }

        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < times.length; i++) {
            graph[times[i][0]].add(new Edge(times[i][0], times[i][1], times[i][2]));
        }
        int dist[] = new int[n + 1];
        boolean vis[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i != k)
                dist[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(k, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int src = e.src;
                    int dest = e.dest;
                    int wt = e.wt;

                    if (dist[src] != Integer.MAX_VALUE &&
                            dist[src] + wt < dist[dest]) {
                        dist[dest] = dist[src] + wt;
                        pq.add(new Pair(dest, dist[dest]));
                    }
                }
            }
        }
        int minTime = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            if(dist[i]==Integer.MAX_VALUE)  return -1;
            minTime = Math.max(minTime, dist[i]);
        }
        return minTime;
    }
}
