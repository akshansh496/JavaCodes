package Graph;
import java.util.*;
public class SetTwo_PracticeQ4 {
    static public class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }


    public static void AlienDictionaryOrder(ArrayList<Edge>[] graph,int k){
        int indeg[]=new int[k];
        for(int i=0;i<k;i++){
            for(Edge e : graph[i]){
                indeg[e.dest]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<k;i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        StringBuilder order = new StringBuilder();
        while(!q.isEmpty()){
            int curr=q.remove();
            order.append((char)(curr+'a'));

            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println(order.toString());
    }

    public static void main(String[] args) {
        int k=4;//no. of alphabets
        String[] dict={"baa","abcd","abca","cab","cad"};
        ArrayList<Edge>[] graph=new ArrayList[k];
        for(int i=0;i<k;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<dict.length-1;i++){
            int len=Math.min(dict[i].length(),dict[i+1].length());
            for(int j=0;j<len;j++){
                if(dict[i].charAt(j)!=dict[i+1].charAt(j)){
                    graph[dict[i].charAt(j)-'a'].add(new Edge(dict[i].charAt(j)-'a', dict[i+1].charAt(j)-'a'));
                    break;
                }
            }
        }
        AlienDictionaryOrder(graph, k);
    }

}
