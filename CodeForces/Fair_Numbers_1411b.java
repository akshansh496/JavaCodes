
import java.util.*;

public class Fair_Numbers_1411b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int t = sc.nextInt();

        while (t-- > 0) {

            /*
             * 2520 is the LCM of numbers 1 to 9.
             * Therefore, 2520 is divisible by every digit from 1 to 9.
             *
             * Hence, the next multiple of 2520 after n
             * gives us a guaranteed fair number.
             */
            long n = sc.nextLong();

            boolean flag = false;

            /*
             * If n is smaller than 2520, search from n up to 2519.
             *
             * If we don't find a fair number, 2520 itself
             * is guaranteed to be fair.
             */
            if (n < 2520) {

                for (long i = n; i < 2520; i++) {

                    // Check whether i is a fair number
                    if (check(i)) {

                        System.out.println(i);
                        flag = true;
                        break;
                    }
                }

                // If a fair number was found, move to next test case
                if (flag) {
                    continue;
                }

            } else {

                /*
                 * Find the next multiple of 2520.
                 *
                 * Example:
                 * n = 350
                 *
                 * n % 2520 = 350
                 * 2520 - 350 = 2170
                 *
                 * upperLimit = 350 + 2170 = 2520
                 *
                 * This guarantees that at least one fair number
                 * exists in the range [n, upperLimit].
                 */
                long upperLimit = n + (2520 - (n % 2520));

                /*
                 * Check every number from n to the next
                 * multiple of 2520.
                 */
                for (long i = n; i <= upperLimit; i++) {

                    // Check whether i is fair
                    if (check(i)) {

                        System.out.println(i);
                        flag = true;
                        break;
                    }
                }

                // If a fair number was found, move to next test case
                if (flag) {
                    continue;
                }
            }
        }
    }

    /*
     * Checks whether a number is fair.
     */
    public static boolean check(long num) {
        long n = num;
        while (n != 0) {
            long rem = n % 10;
            n /= 10;
            if (rem == 0) {
                continue;
            }
            if (num % rem != 0) {
                return false;
            }
        }
        return true;
    }
}
