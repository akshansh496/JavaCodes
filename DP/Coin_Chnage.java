package DP;

public class Coin_Chnage {
    public static void main(String[] args) {
        int[] coins={2,5,3,6};
        int sum=10;
        System.out.println(knapsack(coins, sum));
    }
    public static int knapsack(int[] coins,int sum){
        int n=coins.length+1;
        int s=sum+1;
        int dp[][]=new int[n][s];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<s;j++){
                if(coins[i-1]<=j){
                    //adding no. of ways if we include and no. of ways if we exclude
                    dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
                }
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<s;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n-1][s-1];
    }
}
