
import java.util.Scanner;

public class Multiply_By_2_Divide_by_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int threeCount=0;
            while(n%3==0){
                n/=3;
                threeCount++;
            }
            int twoCount=0;
            while(n%2==0){
                n/=2;
                twoCount++;
            }
            if(n>1 || twoCount>threeCount)  System.out.println(-1);
            else    System.out.println(threeCount + (threeCount - twoCount));
        }
    }
}
