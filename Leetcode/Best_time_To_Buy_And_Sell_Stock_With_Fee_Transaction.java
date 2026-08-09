package Leetcode;

public class Best_time_To_Buy_And_Sell_Stock_With_Fee_Transaction {
    public static int maxProfit(int[] prices, int fee) {
        int dp[][]=new int[prices.length+1][2];
        dp[prices.length][0]=0;
        dp[prices.length][1]=0;
        int profit=0;
        for(int i=prices.length-1;i>=0;i--){
            dp[i][1]= Math.max(dp[i+1][0]-prices[i],dp[i+1][1]);
            dp[i][0]= Math.max(dp[i+1][1]+prices[i]-fee,dp[i+1][0]);
        }
        return dp[0][1];
    }
    public static void main(String[] args) {
        int prices[]={1,3,2,8,4,9};
        int fee=2;
        System.out.println(maxProfit(prices, fee));
    }
}
