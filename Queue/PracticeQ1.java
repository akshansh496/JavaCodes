package Queue;
import java.util.*;
public class PracticeQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            System.out.print((Integer.toBinaryString(q.remove())) +" ");
        }
    }
}
