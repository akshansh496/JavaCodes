
import java.util.Scanner;

public class Buttons_1858A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(c%2==0)  a+=c/2;
            else    a+=(c/2+1);
            b+=c/2;
            if(a>b) System.out.println("First");
            else    System.out.println("Second");
        }
    }
}
