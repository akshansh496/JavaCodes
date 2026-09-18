
import java.util.*;

public class Different_Divisors_1474B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int d = sc.nextInt();
            int p = d + 1;
            while (!isPrime(p)) {
                p++;
            }
            int q = p + d;
            while (!isPrime(q)) {
                q++;
            }
            System.out.println((long) p * q);
        }
    }

    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
