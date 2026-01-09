import java.util.*;
public class function_factorial {
    public static int factorial(int n){
        if(n<0)
        {
        return 1;
        }
        int fact=1;
        while(n>0)
        {
            fact=fact*n--;
        }
        return fact;
    
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        if(factorial(x)!=1)
        System.out.println(factorial(x));
        else
        System.out.println("Invalid output");
    }
}
