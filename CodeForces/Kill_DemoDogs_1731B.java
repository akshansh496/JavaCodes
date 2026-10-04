
import java.util.*;

public class Kill_DemoDogs_1731B {

    static final long MOD = 1_000_000_007L;
    static final long INV6 = 166666668L;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            // long prev[] = new long[n + 1];
            // Arrays.fill(prev, -1);
            // for (int i = 1; i <= n; i++) {
            //     long curr[] = new long[n + 1];
            //     curr[0] = Long.MIN_VALUE;
            //     if (i == 1) {
            //         curr[1] = 1;
            //     }
            //     for (int j = 1; j <= n; j++) {
            //         if (i == 1 && j == 1) {
            //             continue;
            //         }
            //         curr[j] = (long) i * j + Math.max(prev[j], curr[j - 1]);
            //     }
            //     prev = curr;
            // }
            // long ans = prev[n];
            // System.out.println((ans * 2022) % 1000000007);
            long a = n % MOD;
            long b = (n + 1) % MOD;
            long c = (4 * n - 1) % MOD;

            long ans = a * b % MOD;
            ans = ans * c % MOD;
            ans = ans * INV6 % MOD;

            ans = ans * 2022 % MOD;

            System.out.println(ans);
        }
    }
}
