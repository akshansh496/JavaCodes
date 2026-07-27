
import java.util.Scanner;

public class Odd_Grasshopper_1607B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            long x0=sc.nextLong();
            long n=sc.nextLong();
            long r=n/4;
            for(long i=r*4+1;i<=n;i++){
                if(x0%2==0){
                    x0-=i;
                }
                else{
                    x0+=i;
                }
            }
            System.out.println(x0);
        }
    }
}
