

import java.util.Scanner;

public class Luntik_And_Subsequences_1582B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ones=0;
            int zeros=0;
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                if(num==1)  ones++;
                else if(num==0) zeros++;
            }
            long ans = (1L << zeros) * ones;
            System.out.println(ans);
        }
    }
}
