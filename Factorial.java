import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int fact=1;
        for(i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
