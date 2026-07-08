
import java.util.Scanner;

public class Longet_Divisors_Interval_1855B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long testcase=sc.nextLong();
        while(testcase-->0){
            long n=sc.nextLong();
            long count=0;
            for(long i=1;;i++){
                if(n%i==0)  count++;
                else break;
            }
            System.out.println(count);
        }
    }
}
