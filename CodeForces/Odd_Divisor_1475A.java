
import java.util.Scanner;

public class Odd_Divisor_1475A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(n%2!=0){
                System.out.println("YES");
                continue;
            }
            else{
                boolean flag=false;
                while(n>2){
                    n/=2;
                    if(n%2!=0){
                        System.out.println("YES");
                        flag=true;
                        break;
                    }
                }
                if(!flag)   System.out.println("NO");
            }
        }
    }
}
