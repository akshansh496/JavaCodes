import java.util.*;
public class recursion_factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int x){
        if(x==0)
        return 1;
        else{
            return x*fact(x-1);
        }
    }
}
