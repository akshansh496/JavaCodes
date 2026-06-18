package DP;

import java.util.Arrays;

public class Unbounded_knapsack {
    public static int recursion(int val[],int wt[],int idx,int W){
        if(W==0) return 0;
        if(idx==0){
            if(W%wt[0]==0) return W/wt[0]*val[0];
            return 0;
        }
        int notPick=recursion(val, wt, idx-1, W);
        int pick=0;
        if(wt[idx]<=W)  pick=val[idx]+recursion(val, wt, idx, W-wt[idx]);
        return Math.max(pick,notPick);
    }
    public static int memo(int val[],int wt[],int idx,int W,int dp[][]){
        if(W==0) return 0;
        if(idx==0){
            if(W%wt[0]==0) return W/wt[0]*val[0];
            return 0;
        }
        if(dp[idx][W]!=-1) return dp[idx][W];
        int notPick=memo(val, wt, idx-1, W,dp);
        int pick=0;
        if(wt[idx]<=W)  pick=val[idx]+memo(val, wt, idx, W-wt[idx],dp);
        return dp[idx][W]=Math.max(pick,notPick);
    }
    public static int unboundedknapsackTab(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n][W+1];
        for(int i=0;i<n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=W;i++){
            if(i%wt[0]==0)  dp[0][i]=i/wt[0]*val[0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<W+1;j++){
                int v=val[i];
                int w=wt[i];
                if(w<=j){
                    int incProfit=v+dp[i][j-w];
                    int excProfit=dp[i-1][j];
                    dp[i][j]=Math.max(incProfit,excProfit);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n-1][W];
    }
    public static int space_optimised(int val[],int wt[],int W){
        int n=val.length;
        int dp[]=new int[W+1];
        dp[0]=0;
        for(int i=0;i<=W;i++){
            if(i%wt[0]==0)  dp[i]=i/wt[0]*val[0];
        }
        for(int i=1;i<n;i++){
            int curr[]=new int[W+1];
            curr[0]=0;
            for(int j=1;j<W+1;j++){
                int v=val[i];
                int w=wt[i];
                if(w<=j){
                    int incProfit=v+curr[j-w];
                    int excProfit=dp[j];
                    curr[j]=Math.max(incProfit,excProfit);
                }
                else{
                    curr[j]=dp[j];
                }
            }
            dp=curr;
        }
        return dp[W];
    }
    public static int more_space_optimised(int val[],int wt[],int W){
        int n=val.length;
        int dp[]=new int[W+1];
        dp[0]=0;
        for(int i=0;i<=W;i++){
            if(i%wt[0]==0)  dp[i]=i/wt[0]*val[0];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=W;j++){
                int v=val[i];
                int w=wt[i];
                if(w<=j){
                    int incProfit=v+dp[j-w];
                    int excProfit=dp[j];
                    dp[j]=Math.max(incProfit,excProfit);
                }
                else{
                    dp[j]=dp[j];
                }
            }
        }
        return dp[W];
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[val.length][W+1];
        for (int i = 0; i <val.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(recursion(val, wt, val.length-1, W));
        System.out.println(memo(val, wt, val.length-1, W,dp));
        System.out.println(unboundedknapsackTab(val, wt, W));
        System.out.println(space_optimised(val, wt, W));
        System.out.println(more_space_optimised(val, wt, W));
    }   
}
