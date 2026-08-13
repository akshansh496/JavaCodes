
import java.util.Arrays;
import java.util.Scanner;

public class Monsters_1849B {

    // static class Info implements Comparable<Info>{
    //     int idx;
    //     int val;
    //     public Info(int idx,int val){
    //         this.idx=idx;
    //         this.val=val;
    //     }
    //     public int compareTo(Info obj){
    //         if(this.val==obj.val)
    //             return this.idx-obj.idx;
    //         return obj.val-this.val;
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int t=sc.nextInt();
    //     while(t-->0){
    //         int n=sc.nextInt();
    //         int k=sc.nextInt();
    //         PriorityQueue<Info> pq=new PriorityQueue<>();
    //         for(int i=0;i<n;i++){
    //             pq.add(new Info(i, sc.nextInt()));
    //         }
    //         while(!pq.isEmpty()){
    //             Info i=pq.poll();
    //             if(i.val-k<=0)  System.out.print(i.idx+1+" ");
    //             else    pq.add(new Info(i.idx, i.val-k));
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] round = new long[n];
            Integer[] order = new Integer[n];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                round[i] = a % k;
                if (round[i] == 0) round[i] = k;
                order[i] = i;
            }
            Arrays.sort(order, (x, y) -> {
                if (round[x] != round[y]) {
                    return Long.compare(round[y], round[x]);
                }
                return x - y;
            });
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                sb.append(order[i] + 1).append(' ');
            }
            sb.append('\n');

          
            System.out.print(sb);
        }
    }
}
