package Leetcode;

public class Coin_Change_2 {
    public int helper(int idx,int amount,int coins[]){
        if(idx==0){
            if(amount%coins[idx]==0) return 1;
            return 0;
        }
        if(amount==0) return 1;
        int notPick=helper(idx-1,amount,coins);
        int pick=0;
        if(coins[idx]<=amount)  pick=helper(idx,amount-coins[idx],coins);
        return pick+notPick;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0) dp[0][i]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=amount;j++){
                int notPick=dp[i-1][j];
                int pick=0;
                if(coins[i]<=j)  pick=dp[i][j-coins[i]];
                dp[i][j]=pick+notPick;
            }
        }
        return dp[n-1][amount];
    }
    public int space_optimised(int amount, int[] coins) {
        int n=coins.length;
        int prev[]=new int[amount+1];
        prev[0]=1;
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0) prev[i]=1;
        }
        for(int i=1;i<n;i++){
            int curr[]=new int[amount+1];
            curr[0]=1;
            for(int j=1;j<=amount;j++){
                int notPick=prev[j];
                int pick=0;
                if(coins[i]<=j)  pick=curr[j-coins[i]];
                curr[j]=pick+notPick;
            }
            prev=curr;
        }
        return prev[amount];
    }
}
