import java.util.*;
public class Function_prime {
    public static Boolean check_prime(int n){
        int count =0;
        for(int i=1;i<=n;i++){
        if(n%i==0)
        count++;
        }
        if(count!=2)
        return true;
        else 
        return false;
    }
    public static void main(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        if(check_prime(x)==true)
        System.out.println(x+" is a prime number");
        else if(check_prime(x)==false)
        System.out.println(x+" is not a prime number");
    }
}
