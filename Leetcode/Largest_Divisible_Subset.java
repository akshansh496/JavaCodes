package Leetcode;

import java.util.*;


public class Largest_Divisible_Subset {
    public static void main(String[] args) {
        int nums[]={8,1,4,2};
        largestDivisibleSubset(nums);
    }
    public static void largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        System.out.println(helper(nums, 0, -1));
        int dp[][] = new int[nums.length][nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(memo(nums, 0, 0, dp));
        System.out.println(tab(nums));
        System.out.println(intutive_algo(nums));
        System.out.println(print(nums));
    }

    public static int helper(int nums[], int i, int prev) {
        if (i == nums.length)
            return 0;
        int pick = Integer.MIN_VALUE;
        if (prev == -1 || nums[i] % nums[prev] == 0) {
            pick = 1 + helper(nums, i + 1, i);
        }
        int notPick = helper(nums, i + 1, prev);
        return Math.max(pick, notPick);
    }

    public static int memo(int nums[], int i, int prev, int dp[][]) {
        if (i == nums.length)
            return 0;
        if (dp[i][prev] != -1)
            return dp[i][prev];
        int pick = Integer.MIN_VALUE;
        if (prev == 0 || nums[i] % nums[prev - 1] == 0) {
            pick = 1 + memo(nums, i + 1, i + 1, dp);
        }
        int notPick = memo(nums, i + 1, prev, dp);
        return dp[i][prev] = Math.max(pick, notPick);
    }

    public static int tab(int nums[]) {
        int dp[][] = new int[nums.length+1][nums.length + 1];
        for (int i = nums.length-1; i >=0; i--) {
            for (int prev = 0; prev < nums.length + 1; prev++) {
                int pick = Integer.MIN_VALUE;
                if (prev == 0 || nums[i] % nums[prev - 1] == 0) {
                    pick = 1 + dp[i + 1][i + 1];
                }
                int notPick = dp[i + 1][prev];
                dp[i][prev] = Math.max(pick, notPick);
            }
        }
        return dp[0][0];
    }
    public static int intutive_algo(int nums[]){
        int dp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)  dp[i]=1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0)
                dp[i]=Math.max(1+dp[j],dp[i]);
            }
        }
        int ans=1;
        for(int i=1;i<nums.length;i++){
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
    public static List<Integer> print(int nums[]){
        int dp[]=new int[nums.length];
        int idxArr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
            idxArr[i]=-1;
        }  
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        idxArr[i]=j;
                    }
                }
            }
        }
        int ans=1;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] > ans) {
                ans = dp[i];
                idx = i;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (idxArr[idx] != -1) {
            list.add(nums[idx]);
            idx = idxArr[idx];
        }
        list.add(nums[idx]);
        Collections.reverse(list);
        return list;
    }
}
