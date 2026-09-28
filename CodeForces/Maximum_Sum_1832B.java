
import java.util.*;

public class Maximum_Sum_1832B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            long totalSum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                totalSum += arr[i];
            }
            Arrays.sort(arr);
            long dp[][] = new long[n + 1][n + 1];
            for (long[] row : dp) {
                Arrays.fill(row, -1);
            }
            System.out.println(memoization(arr, 0, n - 1, k, totalSum, dp));
        }
    }

    // public static long helper(int arr[], int start, int end, int k, long totalSum) {
    //     if (k == 0) {
    //         return totalSum;
    //     }
    //     return Math.max(helper(arr, start + 2, end, k - 1, totalSum - (arr[start] + arr[start + 1])), helper(arr, start, end - 1, k - 1, totalSum - arr[end]));
    // }
    public static long memoization(int arr[], int start, int end, int k, long totalSum, long dp[][]) {
        if (k == 0) {
            return totalSum;
        }

        if (dp[start][end] != -1) {
            return dp[start][end];
        }

        long removeTwo
                = memoization(arr, start + 2, end, k - 1,
                        totalSum - (arr[start] + arr[start + 1]), dp);

        long removeOne
                = memoization(arr, start, end - 1, k - 1,
                        totalSum - arr[end], dp);

        return dp[start][end] = Math.max(removeTwo, removeOne);
    }
}
