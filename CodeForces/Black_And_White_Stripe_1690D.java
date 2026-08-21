
import java.util.Scanner;

public class Black_And_White_Stripe_1690D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int first=0;
            int last=k-1;
            int maxCount=0;
            while(first<=last){
                if(s.charAt(first++)=='B')  maxCount++;
            }
            int ans=maxCount;
            first=1;
            last=k;
            while(last<n){
                if(s.charAt(last)=='B') maxCount++;
                if(s.charAt(first-1)=='B')  maxCount--;
                first++;
                last++;
                ans=Math.max(ans, maxCount);
            }
            System.out.println(k-ans);
        }
    }
}
