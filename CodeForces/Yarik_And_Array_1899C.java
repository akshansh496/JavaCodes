
import java.util.*;

public class Yarik_And_Array_1899C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(helper(arr));
        }
    }

    public static int helper(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
        }
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            if (((arr[i - 1] & 1) == 1 && (arr[i] & 1) == 0) || ((arr[i - 1] & 1) == 0 && (arr[i] & 1) == 1)) {
                dp[i] = Math.max(arr[i], arr[i] + dp[i - 1]);
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
