
import java.util.Scanner;

public class Walking_master_1806A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(d<b){
                System.out.println(-1);
                continue;
            }
            int count=0;
            int diff=d-b;
            b+=diff;
            a+=diff;
            count+=diff;
            if(a<c){
                System.out.println(-1);
                continue;
            }
            diff=a-c;
            count+=diff;
            System.out.println(count);
        }
    }
}
