
import java.util.Scanner;

public class Blank_Space_1829B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++){
            int n=sc.nextInt();
            int max=0;
            int count=0;
            for(int j=0;j<n;j++){
                int x=sc.nextInt();
                if(x==0){
                    count++;
                    max=Math.max(max, count);
                }   
                else count=0;
            }
            System.out.println(max);
        }
    }
}
