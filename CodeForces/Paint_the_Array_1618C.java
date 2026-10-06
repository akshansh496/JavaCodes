
import java.util.*;

public class Paint_the_Array_1618C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long gcdEven = arr[0];
            long gcdOdd = arr[1];
            for (int i = 2; i < n; i++) {
                if ((i & 1) == 0) {
                    gcdEven = gcd(gcdEven, arr[i]);
                } else {
                    gcdOdd = gcd(gcdOdd, arr[i]);
                }
            }
            boolean even = true;
            boolean odd = true;
            for (int i = 0; i < n; i++) {
                if ((i & 1) == 0 && arr[i] % gcdOdd == 0) {
                    odd = false;
                } else if ((i & 1) != 0 && arr[i] % gcdEven == 0) {
                    even = false;
                }
            }
            if (!odd && !even) {
                System.out.println(0);
            } else if (even) {
                System.out.println(gcdEven);
            } else {
                System.out.println(gcdOdd);
            }
        }
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
