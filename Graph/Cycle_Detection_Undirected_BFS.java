package Graph;

import java.util.ArrayList;

public class Cycle_Detection_Undirected_BFS {
    static class Edge{
        int idx;
        int src;
        int dest;

        public Edge(int idx,int src,int dest) {
            this.idx=idx;
            this.src=src;
            this.dest=dest;
        }
    }
    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        
    }
}
