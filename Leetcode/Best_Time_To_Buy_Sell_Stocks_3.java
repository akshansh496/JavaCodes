package Leetcode;

import java.util.Arrays;

public class Best_Time_To_Buy_Sell_Stocks_3 {
    public static int helper(int prices[],int idx,int buy,int cap){
        if(cap==0)  return 0;
        if(idx==prices.length)  return 0;
        int profit=0;
        if(buy==1){
            profit= Math.max(helper(prices,idx+1,0,cap)-prices[idx],helper(prices,idx+1,1,cap));
        }
        else
            profit= Math.max(helper(prices,idx+1,1,cap-1)+prices[idx],helper(prices,idx+1,0,cap));
        return profit;
    }
    public static int memo(int prices[],int idx,int buy,int cap,int dp[][][]){
        if(cap==0)  return 0;
        if(idx==prices.length)  return 0;
        if(dp[idx][buy][cap]!=-1)    return dp[idx][buy][cap];
        int profit=0;
        if(buy==1){
            profit= Math.max(memo(prices,idx+1,0,cap,dp)-prices[idx],memo(prices,idx+1,1,cap,dp));
        }
        else
            profit= Math.max(memo(prices,idx+1,1,cap-1,dp)+prices[idx],memo(prices,idx+1,0,cap,dp));
        return dp[idx][buy][cap]=profit;
    }
    public static int tab(int prices[]){
        int dp[][][]=new int[prices.length+1][2][3];
        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<2;j++){
                dp[i][j][0]=0;
            }
        }
        for(int j=0;j<2;j++){
            for(int i=0;i<3;i++){
                dp[prices.length][j][i]=0;
                dp[prices.length][j][i]=0;
            }
        }
        int profit=0;
        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int k=1;k<3;k++){
                    if(j==1)    dp[i][j][k]= Math.max(dp[i+1][0][k]-prices[i],dp[i+1][j][k]);
                    else    dp[i][0][k]= Math.max(dp[i+1][1][k-1]+prices[i],dp[i+1][j][k]);
                }
            }
        }
        return dp[0][1][2];
    }
    public static int space_optimisation(int prices[]){
        int dp[][]=new int[2][3];
        for(int j=0;j<2;j++){
            dp[j][0]=0;
        }
        for(int j=0;j<2;j++){
            for(int i=0;i<3;i++){
                dp[j][i]=0;
                dp[j][i]=0;
            }
        }
        int profit=0;
        for(int i=prices.length-1;i>=0;i--){
            int curr[][]=new int[2][3];
            for(int j=0;j<2;j++){
                for(int k=1;k<3;k++){
                    if(j==1)    curr[j][k]= Math.max(dp[0][k]-prices[i],dp[j][k]);
                    else    curr[0][k]= Math.max(dp[1][k-1]+prices[i],dp[j][k]);
                }
            }
            dp=curr;
        }
        return dp[1][2];
    }
    public static void main(String[] args) {
        int prices[]={3,3,5,0,0,3,1,4};
        System.out.println(helper(prices, 0, 1,2));
        int dp[][][]=new int[prices.length][2][3];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i][0],-1);
            Arrays.fill(dp[i][1],-1);
        }
        System.out.println(memo(prices,0,1,2,dp));
        System.out.println(tab(prices)); 
        System.out.println(space_optimisation(prices));
    }
}
