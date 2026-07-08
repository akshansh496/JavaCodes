package Leetcode;
import java.util.*;
public class Best_Time_To_Buy_Sell_Stocks_2 {
    public static int helper(int prices[],int idx,int buy){
        if(idx==prices.length)  return 0;
        int profit=0;
        if(buy==1){
            profit= Math.max(helper(prices,idx+1,0)-prices[idx],helper(prices,idx+1,1));
        }
        else
            profit= Math.max(helper(prices,idx+1,1)+prices[idx],helper(prices,idx+1,0));
        return profit;
    }
    public static int memo(int prices[],int idx,int buy,int dp[][]){
        if(idx==prices.length)  return 0;
        if(dp[idx][buy]!=-1)    return dp[idx][buy];
        int profit=0;
        if(buy==1){
            profit= Math.max(memo(prices,idx+1,0,dp)-prices[idx],memo(prices,idx+1,1,dp));
        }
        else
            profit= Math.max(memo(prices,idx+1,1,dp)+prices[idx],memo(prices,idx+1,0,dp));
        return dp[idx][buy]=profit;
    }
    public static int tab(int prices[]){
        int dp[][]=new int[prices.length+1][2];
        dp[prices.length][0]=0;
        dp[prices.length][1]=0;
        int profit=0;
        for(int i=prices.length-1;i>=0;i--){
            dp[i][1]= Math.max(dp[i+1][0]-prices[i],dp[i+1][1]);
            dp[i][0]= Math.max(dp[i+1][1]+prices[i],dp[i+1][0]);
        }
        return dp[0][1];
    }
    public static int space_optimisation(int prices[]){
        int dp[]=new int[2];
        dp[0]=0;
        dp[1]=0;
        int profit=0;
        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                if(j==1)    dp[j]= Math.max(dp[0]-prices[i],dp[1]);
                else dp[j]= Math.max(dp[1]+prices[i],dp[0]);
            }
        }
        return dp[1];
    }
    public static int more_space_optimisation(int prices[]){
        int buy=0;
        int sell=0;
        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                if(j==1)    buy= Math.max(sell-prices[i],buy);
                else sell= Math.max(buy+prices[i],sell);
            }
        }
        return buy;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(helper(prices, 0, 1));
        int dp[][]=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(memo(prices,0,1,dp));
        System.out.println(tab(prices));
        System.out.println(space_optimisation(prices));
        System.out.println(more_space_optimisation(prices));
    }
}
