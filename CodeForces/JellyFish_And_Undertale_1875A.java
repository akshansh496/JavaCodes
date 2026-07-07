
import java.util.Scanner;

public class JellyFish_And_Undertale_1875A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int tools[]=new int[n];
            for(int i=0;i<n;i++){
                tools[i]=sc.nextInt();
            }
            long ans = b;

            for (int x : tools) {
                ans += Math.min(x, a - 1);
            }
            System.out.println(ans);
        }
    }
}
