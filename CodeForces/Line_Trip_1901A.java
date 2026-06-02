
import java.util.Scanner;

public class Line_Trip_1901A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        for(int j=0;j<testcases;j++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            // HashSet<Integer> set=new HashSet<>();
            // for(int i=0;i<n;i++){
            //     set.add(sc.nextInt());
            // }
            // int maxCapacity=1;
            // int count=0;
            // int idx=0;
            // int capacity=1;
            // while(count!=(x*2)){
            //     count++;
            //     if(count<=x)    idx++;
            //     else    idx--;
            //     capacity--;
            //     if(set.contains(idx)){
            //         capacity=maxCapacity;
            //     }
            //     if(capacity==0 && count < x*2){
            //         maxCapacity++;
            //         count=0;
            //         idx=0;
            //         capacity=maxCapacity;
            //     }
            // }
            // System.out.println(maxCapacity);
            int prev=0;
            int maxCapacity=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                int station=sc.nextInt();
                maxCapacity=Math.max(maxCapacity, station-prev);
                if(i==n-1)
                maxCapacity=Math.max(maxCapacity,(x-station)*2);
                prev=station;
            }
            System.out.println(maxCapacity);
        }
    }
}
