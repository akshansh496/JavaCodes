
import java.util.*;

public class Hexadecimal_Theorem_199A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2;; i++) {
            int temp = list.get(i - 2) + list.get(i - 1);
            if (temp <= n) {
                list.add(temp);
            } else {
                break;
            }
        }
        helper(list, n);
    }

    public static void helper(List<Integer> list, int target) {
        int[] dp = new int[target + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < list.size(); j++) {
                int num = list.get(j);
                if (num > 0 && num <= i
                        && dp[i - num] != Integer.MAX_VALUE) {

                    dp[i] = Math.min(dp[i], 1 + dp[i - num]);
                }
            }
        }

        System.out.println(dp[target] <= 3);
        System.out.println(dp[target]);
    }
}
