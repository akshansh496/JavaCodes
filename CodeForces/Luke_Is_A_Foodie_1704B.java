
import java.util.Scanner;

public class Luke_Is_A_Foodie_1704B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long x=sc.nextLong();
            long flag=sc.nextLong();
            long low=flag-x;
            long high=flag+x;
            int count=0;
            for(int i=1;i<n;i++){
                long cur=sc.nextLong();
                long currLow=cur-x;
                long currHigh=cur+x;

                low=Math.max(low, currLow);
                high=Math.min(high,currHigh);
                if(low>high){
                    count++;
                    low=currLow;
                    high=currHigh;
                }
            }
            System.out.println(count);
        }
    }
}
