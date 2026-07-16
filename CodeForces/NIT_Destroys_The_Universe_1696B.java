
import java.util.Scanner;

public class NIT_Destroys_The_Universe_1696B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            int nonZeroSegment=0;
            int prev=0;
            boolean allZero=true;
            if(prev!=0) allZero=false;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if (x != 0) {
                    allZero = false;
                    if (prev == 0)
                        nonZeroSegment++;
                }
                prev=x;
            }
            if(allZero){
                System.out.println(0);
                continue;
            }
            if(nonZeroSegment>=2){
                System.out.println(2);
                continue;
            }
            System.out.println(1);
        }
    }
}
