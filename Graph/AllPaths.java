package Graph;

import java.util.*;

public class AllPaths {
    static List<List<Integer>> ans=new ArrayList<>();
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        boolean vis[]=new boolean[graph.length];
            helper(graph,0,graph.length-1,vis,new ArrayList<>());

        return ans;
    }
    public static void helper(int[][] graph,int src,int dest,boolean vis[],List<Integer> subans){
        subans.add(src);
        if(src==dest){
            ans.add(new ArrayList<>(subans));
            subans.remove(subans.size() - 1);
            return;
        }
        vis[src]=true;
            for(int j=0;j<graph[src].length;j++){
                if(!vis[graph[src][j]]){
                    helper(graph,graph[src][j],dest,vis,subans);
                }
            }
        vis[src]=false;
        subans.remove(subans.size() - 1);
    }
    public static void main(String[] args) {
        int[][] graph = {{1,2},{3},{3},{}};
        System.out.println(allPathsSourceTarget(graph));
        // github

    }
}

