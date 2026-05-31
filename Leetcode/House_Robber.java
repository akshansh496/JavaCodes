package Leetcode;
import java.util.*;
public class House_Robber {
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);

        System.out.println(helper(nums,n-1));
        System.out.println(memo(nums, n-1, dp));
        System.out.println(tab(nums));
        System.out.println(space_optimisation(nums));
    }
    public static int helper(int[] nums,int idx){
        if(idx==0) return nums[idx];
        if(idx<0) return 0;
        int pick=nums[idx]+helper(nums,idx-2);
        int dontPick=helper(nums,idx-1);
        return Math.max(pick,dontPick);
    }
    public static int memo(int[] nums,int idx,int dp[]){
        if(idx==0) return nums[idx];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick=nums[idx]+memo(nums,idx-2,dp);
        int dontPick=memo(nums,idx-1,dp);
        return dp[idx]=Math.max(pick,dontPick);
    }
    public static int tab(int[] nums){
        int n=nums.length;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<=n;i++){
            dp[i]=Math.max(nums[i-1]+dp[i-2],dp[i-1]);
        }
        return dp[n];
    }
    //Space-optimisation
    public static int space_optimisation(int[] nums){
        int n=nums.length;
        int prev2=0;
        int prev=nums[0];
        for(int i=2;i<=n;i++){
            int curr=Math.max(nums[i-1]+prev2,prev);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}
