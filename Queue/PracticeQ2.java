package Queue;
import java.util.*;
public class PracticeQ2 {
    public static void main(String[] args) {
        int arr[]={4,3,2,6};
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }
        int res=0;
        while(q.size()>1){
            int first=q.poll();
            int second=q.poll();
            res+=first+second;
            q.add(first+second);
        }
        System.out.println(res);
    }
}
