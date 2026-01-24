package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Cheapest_Flight_wtih_atmost_K_stops {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void createGraph(int[][] flights,ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flights.length;i++){
            graph[flights[i][0]].add(new Edge(flights[i][0],flights[i][1],flights[i][2]));
        }
    }

    static class Info{
        int v;
        int cost;
        int stops;

        public Info(int v,int cost,int stops){
            this.v=v;
            this.cost=cost;
            this.stops=stops;
        }
    }
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Edge> graph[]=new ArrayList[n];
        createGraph(flights,graph);

        int cost[]=new int[n];
        for(int i=0;i<n;i++){
            if(i!=src)
            cost[i]=Integer.MAX_VALUE;
        }
        Queue<Info> q=new LinkedList<>();
        q.add(new Info(src,0,0));

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr.stops>k) break;

            for(int i=0;i<graph[curr.v].size();i++){
                Edge e=graph[curr.v].get(i);
                if(curr.cost+e.wt<cost[e.dest]){
                    cost[e.dest]=curr.cost+e.wt;
                    q.add(new Info(e.dest,cost[e.dest],curr.stops+1));
                }
            }
        }
        if(cost[dst]==Integer.MAX_VALUE) return -1;
        else return cost[dst];
    }
    public static void main(String[] args) {
        int[][] flights={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        System.out.println(findCheapestPrice(4,flights,0,3,1));
    }
}

