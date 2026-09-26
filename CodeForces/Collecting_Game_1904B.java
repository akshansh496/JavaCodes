
import java.util.*;

public class Collecting_Game_1904B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[][] = new long[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextLong();
                arr[i][1] = i;
            }
            Arrays.sort(arr, (a, b) -> {
                return Long.compare(a[0], b[0]);
            });
            long prefixSum[] = new long[n];
            prefixSum[0] = arr[0][0];
            long ans[] = new long[n];
            ans[n - 1] = n - 1;
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + arr[i][0];
            }
            for (int i = n - 2; i >= 0; i--) {
                if (prefixSum[i] >= arr[i + 1][0]) {
                    ans[i] = ans[i + 1];
                } else {
                    ans[i] = i;
                }
            }
            long result[] = new long[n];

            for (int i = 0; i < n; i++) {
                result[(int) arr[i][1]] = ans[i];
            }

            for (long i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
