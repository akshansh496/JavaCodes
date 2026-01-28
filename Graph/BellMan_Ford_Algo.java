package Graph;

import java.util.ArrayList;
//Bellman–Ford Algorithm is used to find the shortest paths from a single source vertex to all other vertices in a graph.
// this doesn't work for -ve weighted cycle(total weight of a cycle will always be +ve)
public class BellMan_Ford_Algo {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src,int dest,int wt) {
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph [0]. add (new Edge(0, 1, 2));
        graph [0]. add (new Edge( 0, 2,4));
        graph [1]. add (new Edge(1,2, -4));
        graph [2]. add (new Edge(2, 3, 2));
        graph [3]. add (new Edge(3, 4, 4));
        graph [4]. add (new Edge(4, 1, -1));
    }

    public static void Bellman_Ford(ArrayList<Edge>[] graph,int src){//O(V*E)
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        for(int t=0;t<graph.length-1;t++){
            for(int i=0;i<graph.length;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e=graph[i].get(j);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }
        for(int i=0;i<graph.length;i++){
            System.out.println(dist[i]);
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge>[] graph=new ArrayList[5];
        createGraph(graph);
        Bellman_Ford(graph, 0);
    }
}
