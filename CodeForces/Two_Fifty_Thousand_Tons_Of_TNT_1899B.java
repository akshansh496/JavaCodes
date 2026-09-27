
import java.util.*;

public class Two_Fifty_Thousand_Tons_Of_TNT_1899B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }
            long ans = max - min;
            long prefixSum[] = new long[n];
            prefixSum[0] = arr[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + arr[i];
            }
            for (int k = 2; k <= n / 2; k++) {
                max = Long.MIN_VALUE;
                min = Long.MAX_VALUE;
                if (n % k == 0) {
                    long prev = prefixSum[k - 1];
                    max = Math.max(max, prev);
                    min = Math.min(min, prev);
                    for (int i = 2 * k - 1; i < n; i += k) {
                        long val = prefixSum[i] - prev;
                        max = Math.max(max, val);
                        min = Math.min(min, val);
                        prev = prefixSum[i];
                    }
                    ans = Math.max(ans, max - min);
                }
            }
            System.out.println(ans);
        }
    }
}
