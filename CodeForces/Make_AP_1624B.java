
import java.util.Scanner;

public class Make_AP_1624B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(((2*b)-c)>0 && ((2*b)-c)%a==0){
                System.out.println("Yes");
                continue;
            }
            else if((a+c)>0 && (a+c)%(2*b)==0){
                System.out.println("Yes");
                continue;
            }
            else if(((2*b)-a)>0 && ((2*b)-a)%c==0){
                System.out.println("Yes");
                continue;
            }
            else{
                System.out.println("No");
            }
        }
    }
}
