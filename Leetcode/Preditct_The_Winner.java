package Leetcode;

import java.util.Arrays;

public class Preditct_The_Winner {
     public static boolean predictTheWinner(int[] nums) {
        int dp[][][]=new int[nums.length][nums.length][2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        int sum=helper(nums,0,nums.length-1,1,dp);
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        return sum>=(totalSum-sum);
    }
    public static int helper(int[] nums,int start,int end,int flag,int dp[][][]){
        if(start==end){
            if(flag==0)   return 0;
            else    return nums[start];
        } 
        if(dp[start][end][flag]!=-1)    return dp[start][end][flag];
        if(flag==1){
            int first=(nums[start]+helper(nums,start+1,end,0,dp));
            int second=(nums[end]+helper(nums,start,end-1,0,dp));
            return dp[start][end][flag]=Math.max(first,second);
        }else{
            int first=helper(nums,start+1,end,1,dp);
            int second=helper(nums,start,end-1,1,dp);
            return dp[start][end][flag]=Math.min(first,second);
        }   
    }
    public static void main(String[] args) {
        int nums[]={1,5,233,7};
        System.out.println(predictTheWinner(nums));
    }
}
