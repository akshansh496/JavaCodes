package DP;

import java.util.*;

public class Subset_Sum_Equals_K {
    public static int recursion(int nums[],int sum,int idx){
        if(sum==0)  return 1;
        if(idx==0){
            if(nums[0]==sum)    return 1;
            else    return 0;
        } 
        int notTake=recursion(nums, sum, idx-1);
        int take=0;
        if(nums[idx]<=sum)  take=recursion(nums, sum-nums[idx], idx-1);
        return take+notTake;
    }
    public static int memo(int nums[],int sum,int idx,int dp[][]){
        if(sum==0)  return 1;
        if(idx==0){
            if(nums[0]==sum)    return 1;
            else    return 0;
        } 
        if(dp[idx][sum]!=-1)    return dp[idx][sum];
        int notTake=memo(nums, sum, idx-1,dp);
        int take=0;
        if(nums[idx]<=sum)  take=memo(nums, sum-nums[idx], idx-1,dp);
        return dp[idx][sum]=take+notTake;
    }
    public static int tab(int nums[],int sum){
        int n=nums.length;
        int dp[][]=new int[n][sum+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        if(nums[0]<=sum)    dp[0][nums[0]]=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=sum;j++){
                int notTake=dp[i-1][j];
                int take=0;
                if(nums[i]<=j)    take=dp[i-1][j-nums[i]];
                dp[i][j]=take+notTake;
            }
        }
        return dp[n-1][sum];
    }
    public static int space_optmisation(int nums[],int sum){
        int n=nums.length;
        int dp[]=new int[sum+1];
        dp[0]=1;
        if(nums[0]<=sum)    dp[nums[0]]=1;
        for(int i=1;i<n;i++){
            int curr[]=new int[sum+1];
            curr[0] = 1;
            for(int j=1;j<=sum;j++){
                int notTake=dp[j];
                int take=0;
                if(nums[i]<=j)    take=dp[j-nums[i]];
                curr[j]=take+notTake;
            }
            dp=curr;
        }
        return dp[sum];
    }
    public static void main(String[] args) {
        int nums[]={1,3,2};
        int n=nums.length;
        int sum=3;
        System.out.println(recursion(nums, sum,n-1 ));

        int dp[][]=new int[n][sum+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }

        System.out.println(memo(nums, sum, n-1, dp));

        System.out.println(tab(nums, sum));
        System.out.println(space_optmisation(nums, sum));
    }
}
