
import java.util.Scanner;

public class FarmPiggie_And_Subset_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                if(i%2==0)System.out.print((i-1)+" ");
                else    System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
    
}
