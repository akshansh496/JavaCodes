package Leetcode;

import java.util.*;

public class Minimum_Cost_For_tickets {

        public static int recursion(int[] days, int[] costs, int idx, int LastDay) {
            if (idx < 0) {
                return 0;
            }
            if (LastDay <= 0) {
                return 0;
            }
            if (days[idx] > LastDay) {
                return recursion(days, costs, idx - 1, LastDay);
            }
            int oneDay = costs[0] + recursion(days, costs, idx - 1, days[idx] - 1);
            int sevenDay = costs[1] + recursion(days, costs, idx - 1, days[idx] - 7);
            int oneMonth = costs[2] + recursion(days, costs, idx - 1, days[idx] - 30);
            return Math.min(oneMonth, Math.min(oneDay, sevenDay));
        }

        public static int memo(int[] days, int[] costs, int idx, int LastDay, int dp[][]) {
            if (idx < 0) {
                return 0;
            }
            if (LastDay <= 0) {
                return 0;
            }
            if (dp[idx][LastDay] != -1) {
                return dp[idx][LastDay];
            }
            if (days[idx] > LastDay) {
                return dp[idx][LastDay] = memo(days, costs, idx - 1, LastDay, dp);
            }
            int oneDay = costs[0] + memo(days, costs, idx - 1, days[idx] - 1, dp);
            int sevenDay = costs[1] + memo(days, costs, idx - 1, days[idx] - 7, dp);
            int oneMonth = costs[2] + memo(days, costs, idx - 1, days[idx] - 30, dp);
            return dp[idx][LastDay] = Math.min(oneMonth, Math.min(oneDay, sevenDay));
        }

        public static int tabulation(int[] days, int[] costs) {
            int n = days.length;
            int maxdays = days[n - 1];
            int dp[] = new int[maxdays + 1];
            dp[0] = 0;
            HashSet<Integer> travelDays = new HashSet<>();

            for (int day : days) {
                travelDays.add(day);
            }
            for (int j = 1; j <= maxdays; j++) {
                if (!travelDays.contains(j)) {
                    dp[j] = dp[j - 1];
                    continue;
                }
                int oneDay = costs[0];
                int sevenDay = costs[1];
                int month = costs[2];
                if (j - 1 >= 0) {
                    oneDay += dp[j - 1];
                }
                if (j - 7 >= 0) {
                    sevenDay += dp[j - 7];
                }
                if (j - 30 >= 0) {
                    month += dp[j - 30];
                }
                dp[j] = Math.min(oneDay, Math.min(sevenDay, month));
            }
        return dp[maxdays];
    }
    public static void main(String[] args) {
        int days[] = {1, 4, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 27, 28};
        int n = days.length;
        int costs[] = {3, 13, 45};
        System.out.println(recursion(days, costs, n - 1, days[n - 1]));
        int dp[][] = new int[n][days[n - 1] + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(memo(days, costs, n - 1, days[n - 1], dp));
        System.out.println(tabulation(days, costs));
    }
}
