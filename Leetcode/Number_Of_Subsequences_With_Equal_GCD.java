package Leetcode;

public class Number_Of_Subsequences_With_Equal_GCD {
    static long count=0;
    static final int MOD = 1_000_000_007;
    static Long[][][] memo;
    public static void subsequencePairCount(int[] nums) {
        f(0,0,0,nums);
        System.out.println(count);
        int n = nums.length;
        int maxVal =1;
        for(int i=0;i<n;i++){
            maxVal=Math.max(maxVal,nums[i]);
        }
        memo = new Long[n + 1][maxVal + 1][maxVal + 1];
        System.out.println((int) memoization(0, 0, 0, nums)); 
        System.out.println((int)tab(nums)); 
        System.out.println(space_optimisation(nums));
    }
    public static void f(int i,int sub1,int sub2,int[] nums){
        if(i==nums.length){
            if(sub1!=0 && sub2!=0 && sub1==sub2)    count++;
            return;
        }
        // index i goes to sub1
        f(i + 1, gcd(nums[i], sub1), sub2, nums);
        // index i goes to sub2
        f(i + 1, sub1, gcd(nums[i], sub2), nums);
        // index i is unused (not in either)
        f(i + 1, sub1, sub2, nums);
    }
    public static long memoization(int i, int g1, int g2, int[] nums) {
        if (i == nums.length) {
            return (g1 != 0 && g2 != 0 && g1 == g2) ? 1 : 0;
        }
        if (memo[i][g1][g2] != null) return memo[i][g1][g2];

        long ways = 0;
        ways = (ways + memoization(i + 1, gcd(nums[i], g1), g2, nums)) % MOD;      // i -> sub1
        ways = (ways + memoization(i + 1, g1, gcd(nums[i], g2), nums)) % MOD;      // i -> sub2
        ways = (ways + memoization(i + 1, g1, g2, nums)) % MOD;                    // i unused

        return memo[i][g1][g2] = ways;
    }
    public static int tab(int[] nums) {
        int n = nums.length;
        int maxVal =1;
        for(int i=0;i<n;i++){
            maxVal=Math.max(maxVal,nums[i]);
        }
        long dp[][][]=new long[n+1][maxVal+1][maxVal+1];
        for (int j = 0; j <= maxVal; j++) {
            for (int k = 0; k <= maxVal; k++) {
                dp[n][j][k] = (j != 0 && k != 0 && j == k) ? 1 : 0;
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=maxVal;j>=0;j--){
                for(int k=maxVal;k>=0;k--){
                    long ways = 0;
                    ways = (ways + dp[i + 1][gcd(nums[i], j)][k]) % MOD;      
                    ways = (ways + dp[i + 1][j][gcd(nums[i],k)]) % MOD;      
                    ways = (ways + dp[i + 1][j][k]) % MOD;
                    dp[i][j][k]=ways;
                }
            }
        }
        return (int)dp[0][0][0];
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int space_optimisation(int[] nums) {
        int n = nums.length;
        int maxVal =1;
        for(int i=0;i<n;i++){
            maxVal=Math.max(maxVal,nums[i]);
        }
        long after[][]=new long[maxVal+1][maxVal+1];
        for (int j = 0; j <= maxVal; j++) {
            for (int k = 0; k <= maxVal; k++) {
                after[j][k] = (j != 0 && k != 0 && j == k) ? 1 : 0;
            }
        }
        for(int i=n-1;i>=0;i--){
            long curr[][]=new long[maxVal+1][maxVal+1];
            for(int j=maxVal;j>=0;j--){
                for(int k=maxVal;k>=0;k--){
                    long ways = 0;
                    ways = (ways + after[gcd(nums[i], j)][k]) % MOD;      
                    ways = (ways + after[j][gcd(nums[i],k)]) % MOD;      
                    ways = (ways + after[j][k]) % MOD;
                    curr[j][k]=ways;
                }
            }
            after=curr;
        }
        return (int)after[0][0];
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        subsequencePairCount(nums);
    }
}
