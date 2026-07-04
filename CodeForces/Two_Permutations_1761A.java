
import java.util.Scanner;

public class Two_Permutations_1761A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a+b+2<=n || (a==b && a==n))  System.out.println("YES");
            else    System.out.println("NO");
        }
    }
}
