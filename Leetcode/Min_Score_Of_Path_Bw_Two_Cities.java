package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Min_Score_Of_Path_Bw_Two_Cities {
    static int min=Integer.MAX_VALUE;
    static boolean vis[];
    static class Edge{
        int dest;
        int wt;
        public Edge(int dest,int wt) {
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static int minScore(int n, int[][] roads) {
        vis=new boolean[n+1];
        List<Edge>[] arr=new List[n+1];
        for(int i=0;i<n+1;i++){
            arr[i]=new ArrayList<>();
        }
        for(int i=0;i<roads.length;i++){
            arr[roads[i][0]].add(new Edge(roads[i][1],roads[i][2]));
            arr[roads[i][1]].add(new Edge(roads[i][0],roads[i][2]));
        }
        helper(arr,1,n);
        return min;
    }
    public static void helper(List<Edge>[] arr,int src,int n){
        vis[src]=true;
        List<Edge> list=arr[src];
        for(Edge e:list){
            min=Math.min(min,e.wt);
            if(!vis[e.dest])    helper(arr,e.dest,n);
        }
    }
    public static void main(String[] args) {
        int roads[][]={{1,2,9},{2,3,6},{2,4,5},{1,4,7}};
        System.out.println(minScore(4, roads));
    }
}
