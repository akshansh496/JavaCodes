
import java.util.Scanner;

public class AvtoBus_1679A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            long n=sc.nextLong();
            if(n<4 || n%2!=0){
                System.out.println(-1);
                continue;
            }
            long max=n/4;
            long min=max;
            if(n%6==0)  min=n/6;
            else  min=n/6+1;            
            System.out.println(min+" "+max);
        }
    }
}
