import java.util.*;
public class greatest_common_divisor {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int result=hcf(x,y);
        System.out.println(result);
        }
        public static int hcf(int a,int b){
            while (a!=b){
                if(a>b)
                a=a-b;
                else
                b=b-a;
            }
            return a;
        }
}
