
import java.util.Scanner;

public class Exciting_bets_1543A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long diff=Math.abs(a-b);
            if(diff==0){
                System.out.println(0+" "+0);
                continue;
            }
            long r=a%diff;
            System.out.println(diff+" "+Math.min(r,diff-r));
        }
    }
    
}
