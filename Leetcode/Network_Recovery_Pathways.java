package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Network_Recovery_Pathways {
    static int best = Integer.MIN_VALUE;
    static List<List<int[]>> adj;

    public static int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length-1;
        adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }
        
        helper(online, k, 0, n, Integer.MAX_VALUE, 0);
        
        return best == Integer.MIN_VALUE ? -1 : best;
    }

    public static void helper(boolean[] online, long k, int src, int n, int minEdge, long totalEdge) {
        if (totalEdge > k) return;
        if (src == n) {
            if (minEdge != Integer.MAX_VALUE) {
                best = Math.max(best, minEdge);
            }
            return;
        }
        if (!online[src]) return;
        for (int[] neighbor : adj.get(src)) {
            int dest = neighbor[0];
            int weight = neighbor[1];
            helper(online, k, dest, n, Math.min(minEdge, weight), totalEdge + weight);
        }
    }
    public static void main(String[] args) {
        int edges[][]={{0,1,5},{1,3,10},{0,2,3},{2,3,4}};
        boolean online[]={true,true,true,true};
        System.out.println(findMaxPathScore(edges,online,10));
    }
}
