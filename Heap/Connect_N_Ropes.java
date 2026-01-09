package Heap;
import java.util.*;
public class Connect_N_Ropes {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int ropes[]={2,3,3,4,6};
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int totalCost=0;
        while(pq.size()>1){
            int a=pq.remove();
            int b=pq.remove();
            totalCost+=a+b;
            pq.add(a+b);
        }
        System.out.println("Total cost : "+totalCost);
    }
}
