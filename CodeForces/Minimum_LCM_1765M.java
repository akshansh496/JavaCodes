
import java.util.Scanner;

public class Minimum_LCM_1765M {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            // Find the smallest divisor of n greater than 1.
            int divisor = -1;
            // We only need to check up to sqrt(n).
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    divisor = i;
                    break;
                }
            }
            // If no divisor was found, n is prime.
            if (divisor == -1) {
                System.out.println(1 + " " + (n - 1));
            } 
            else {
                // The largest divisor of n that is <= n/2
                // is n / smallest_divisor.
                int a = n / divisor;
                // We need a + b = n.
                int b = n - a;
                System.out.println(a + " " + b);
            }
        }
    }
    
}
