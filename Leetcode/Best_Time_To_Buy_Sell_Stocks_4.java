package Leetcode;
import java.util.*;
public class Best_Time_To_Buy_Sell_Stocks_4 {
    public static void maxProfit(int k, int[] prices) {
        int dp[][]=new int[prices.length][2*k];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(memo(0,0,prices,k,dp)); 
        System.out.println(helper(0,0,prices,k)); 
        System.out.println(tab(k,prices)); 
        System.out.println(space_optimisation(k,prices)); 
        System.out.println(more_space_optimisation(k,prices));
    }
    public static int helper(int i,int j,int[] prices,int k){
        if(i==prices.length || j==(2*k))    return 0;
        int profit=0;
        if(j%2==0){
            profit=Math.max(helper(i+1,j+1,prices,k)-prices[i],helper(i+1,j,prices,k));
        }
        else{
            profit=Math.max(helper(i+1,j+1,prices,k)+prices[i],helper(i+1,j,prices,k));
        }
        return profit;
    }
    public static int memo(int i,int j,int[] prices,int k,int dp[][]){
        if(i==prices.length || j==(2*k))    return 0;
        if(dp[i][j]!=-1)    return dp[i][j];
        int profit=0;
        if(j%2==0){
            profit=Math.max(memo(i+1,j+1,prices,k,dp)-prices[i],memo(i+1,j,prices,k,dp));
        }
        else{
            profit=Math.max(memo(i+1,j+1,prices,k,dp)+prices[i],memo(i+1,j,prices,k,dp));
        }
        return dp[i][j]=profit;
    }
    public static int tab(int k, int[] prices){
        int dp[][]=new int[prices.length+1][2*k+1];
        for(int i=prices.length-1;i>=0;i--){
            for(int j=2*k-1;j>=0;j--){
                int profit=0;
                if(j%2==0){
                    profit=Math.max(dp[i+1][j+1]-prices[i],dp[i+1][j]);
                }
                else{
                    profit=Math.max(dp[i+1][j+1]+prices[i],dp[i+1][j]);
                }
                dp[i][j]=profit;
            }
        }
        return  dp[0][0];
    }
    public static int space_optimisation(int k, int[] prices){
        int dp[]=new int[2*k+1];
        for(int i=prices.length-1;i>=0;i--){
            int curr[]=new int[2*k+1];
            for(int j=2*k-1;j>=0;j--){
                int profit=0;
                if(j%2==0){
                    profit=Math.max(dp[j+1]-prices[i],dp[j]);
                }
                else{
                    profit=Math.max(dp[j+1]+prices[i],dp[j]);
                }
                curr[j]=profit;
            }
            dp=curr;
        }
        return dp[0];
    }
    public static int more_space_optimisation(int k, int[] prices){
        int dp[]=new int[2*k+1];
        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<2*k;j++){
                int profit=0;
                if(j%2==0){
                    profit=Math.max(dp[j+1]-prices[i],dp[j]);
                }
                else{
                    profit=Math.max(dp[j+1]+prices[i],dp[j]);
                }
                dp[j]=profit;
            }
        }
        return dp[0];
    }
    public static void main(String[] args) {
        int prices[]={2,4,1};
        int k=2;
        maxProfit(k, prices);
    }
}
