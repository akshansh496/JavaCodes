
import java.util.Scanner;

public class Permutation_Swap_1828B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            int ans=0;
            for(int i=1;i<=n;i++){
                int x=sc.nextInt();
                if(x!=i)
                ans=gcd(ans,Math.abs(x-i));
            }
            System.out.println(ans);
        }
    }
    public static int gcd(int a,int b){
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
