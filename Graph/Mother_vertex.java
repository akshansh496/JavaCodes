package Graph;

import java.util.ArrayList;

public class Mother_vertex {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[5];
        createGraph(graph);
        for(int i=0;i<5;i++){
            boolean vis[]=new boolean[5];
            helper(graph,i,vis);
            boolean isMother = true;

            for(int j=0;j<vis.length;j++){
                if(!vis[j]){
                    isMother = false;
                    break;
                }
            }

            if(isMother){
                System.out.println(i);
                break;
            }
        }
    }
    public static void helper(ArrayList<Edge>[] graph,int src,boolean vis[]){
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!vis[e.dest]){
            helper(graph,e.dest,vis);
            }
        }
    }
}
