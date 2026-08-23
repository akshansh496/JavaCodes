package Leetcode;

public class Sum_Game {
    public static boolean sumGame(String num) {

        int n = num.length() / 2;

        int left = 0;
        int right = 0;

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {

            if (num.charAt(i) == '?')
                left++;
            else
                sum1 += num.charAt(i) - '0';

            if (num.charAt(i + n) == '?')
                right++;
            else
                sum2 += num.charAt(i + n) - '0';
        }

        int questionDiff = left - right;
        int sumDiff = sum1 - sum2;

        if (questionDiff % 2 != 0)
            return true;

        return sumDiff != -9 * questionDiff / 2;
    }
    public static void main(String[] args) {
        System.out.println(sumGame("?6?6?000?3"));
    }
}
