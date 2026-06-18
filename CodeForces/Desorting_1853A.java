
import java.util.Scanner;

public class Desorting_1853A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int ans=Integer.MAX_VALUE;
            boolean flag=false;
            int prev;
            prev=sc.nextInt();
            for(int i=1;i<n;i++){
                int curr=sc.nextInt();
                int diff=curr-prev;
                if(diff<0){
                    flag=true;
                }
                ans=Math.min(ans,diff);
                prev=curr;
            }
            if(flag) System.out.println(0);
            else System.out.println(ans/2+1);
        }
    }
}
