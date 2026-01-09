package Queue;
import java.util.*;
public class TIme_Needed_To_Buy_Tickets {
    public static void main(String[] args){
        int arr[]={2,3,2};
        System.out.println(timeRequiredToBuy(arr,2));
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        int time=0;
        while(!q.isEmpty()){
            time++;
            int popped=q.remove();
            tickets[popped]--;
            if(popped==k && tickets[popped]==0)
            return time;
            if(tickets[popped]!=0)
            q.add(popped);
        }
        return time;
    }
}
