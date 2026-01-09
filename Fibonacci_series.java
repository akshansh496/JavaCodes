import java.util.*;
public class Fibonacci_series {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int range=sc.nextInt();
        int x=0;
        int y=1;
        System.out.print(x+" "+y+" ");
        for(int i=2;i<range;i++){
            int sum=x+y;
            x=y;
            y=sum;
            System.out.print(sum+" ");
        }
    }
    
}
