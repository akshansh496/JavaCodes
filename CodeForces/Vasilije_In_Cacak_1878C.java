
import java.util.Scanner;

public class Vasilije_In_Cacak_1878C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long testcase = sc.nextLong();
        for (int i = 0; i < testcase; i++) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            // Minimum possible sum:
            // Pick the smallest k distinct numbers -> 1, 2, 3, ..., k
            // Sum = k * (k + 1) / 2
            long min = k * (k + 1) / 2;
            // Maximum possible sum:
            // Pick the largest k distinct numbers ->
            // (n-k+1), (n-k+2), ..., n
            //
            // AP Sum = k * (first + last) / 2
            //        = k * ((n-k+1) + n) / 2
            //        = k * (2*n - k + 1) / 2
            long max = k * (2 * n - k + 1) / 2;

            /*
             * Key Observation:
             *
             * Every sum between 'min' and 'max' is achievable.
             *
             * Example:
             * n = 6, k = 3
             *
             * 1 2 3 -> 6
             * 1 2 4 -> 7
             * 1 3 4 -> 8
             * 2 3 4 -> 9
             * 2 3 5 -> 10
             * 2 4 5 -> 11
             * 3 4 5 -> 12
             * 3 4 6 -> 13
             * 3 5 6 -> 14
             * 4 5 6 -> 15
             *
             * Hence, if x lies in [min, max], answer is YES.
             */
            if (x >= min && x <= max) {
                System.out.println("YES"); 
            }else {
                System.out.println("NO");
            }
        }

    }
}
