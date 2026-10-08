package Leetcode;

public class Stone_Game_2 {

    public static void main(String[] args) {
        int piles[] = {2, 7, 9, 4, 4};
        System.out.println(stoneGameII(piles));
    }
    static Integer[][][] memo;

    public static int stoneGameII(int[] piles) {
        int n = piles.length;
        memo = new Integer[n][n + 1][2];
        return helper(piles, true, 0, 1);
    }

    public static int helper(int[] piles, boolean flag, int idx, int M) {
        if (idx >= piles.length) {
            return 0;
        }

        int f = flag ? 1 : 0;
        if (memo[idx][M][f] != null) {
            return memo[idx][M][f];
        }

        int best = flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int sum = 0;
        for (int i = idx; i < Math.min(piles.length, idx + 2 * M); i++) {
            sum += piles[i];
            int next = helper(piles, !flag, i + 1, Math.max(M, i - idx + 1));
            if (flag) {
                best = Math.max(best, sum + next); 
            }else {
                best = Math.min(best, next);
            }
        }
        return memo[idx][M][f] = best;
    }
}
