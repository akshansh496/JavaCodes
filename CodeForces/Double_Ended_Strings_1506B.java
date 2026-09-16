
import java.util.*;

public class Double_Ended_Strings_1506B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            String str1 = sc.next();
            String str2 = sc.next();
            int n = str1.length();
            int m = str2.length();
            int dp[][] = new int[n + 1][m + 1];
            int max = 0;
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                        max = Math.max(max, dp[i][j]);
                    } else {
                        dp[i][j] = 0;
                    }
                }
            }
            System.out.println((n - max) + (m - max));
        }
    }
}
