
import java.util.*;

public class Scuza_1742E {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            long arr[] = new long[n];
            arr[0] = sc.nextInt();
            for (int i = 1; i < n; i++) {
                arr[i] = sc.nextLong() + arr[i - 1];
            }
            long diff[] = new long[n];
            diff[0] = arr[0];
            for (int i = 1; i < n; i++) {
                diff[i] = Math.max(diff[i - 1], arr[i] - arr[i - 1]);
            }
            long questions[] = new long[q];
            for (int i = 0; i < q; i++) {
                questions[i] = sc.nextLong();
                int idx = farthestLessOrEqual(diff, questions[i]);
                if (idx == -1) {
                    System.out.print(0 + " ");
                    continue;
                }
                System.out.print(arr[idx] + " ");
            }
            System.out.println();
        }
    }

    public static int farthestLessOrEqual(long[] arr, long k) {
        int lo = 0, hi = arr.length - 1;
        int ans = -1; // -1 means no element is <= k

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] <= k) {
                ans = mid;      // valid; save and push right to get farther from index 0
                lo = mid + 1;
            } else {
                hi = mid - 1;   // arr[mid] > k; step height is too large, look left
            }
        }
        return ans;
    }
}
