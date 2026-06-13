package DP;

import java.util.Arrays;

public class Zero_One_Knapsack {
    //recursion
    public static int knapsack(int val[], int wt[], int W, int n) {
        // Base case
        if (W == 0 || n == 0)
            return 0;

        // If weight of nth item <= capacity
        if (wt[n - 1] <= W) {
            // Include
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);

            // Exclude
            int ans2 = knapsack(val, wt, W, n - 1);

            return Math.max(ans1, ans2);
        } 
        else {
            // Cannot include
            return knapsack(val, wt, W, n - 1);
        }
    }
    //memoization
    public static int knapsackMemoization(int val[],int wt[],int W,int n,int memory[][]){
        if(W==0 || n==0)
        return 0;
        if(memory[W][n]!=-1) return memory[W][n];
        if(wt[n-1]<=W){
            //include
            int ans1=val[n-1]+knapsackMemoization(val, wt, W-wt[n-1], n-1, memory);
            //exclude
            int ans2=knapsackMemoization(val, wt, W, n-1,memory);
            memory[W][n]= Math.max(ans1,ans2);
        }
        else{
            memory[W][n]=knapsackMemoization(val, wt, W, n-1, memory);
        }
        return memory[W][n];
    }
    //tabulation
    public static int knapsackTab(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v=val[i-1];
                int w=wt[i-1];
                if(w<=j){
                    int incProfit=v+dp[i-1][j-w];
                    int excProfit=dp[i-1][j];
                    dp[i][j]=Math.max(incProfit,excProfit);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    //space-optmisation
    public static int space_optmisation(int val[],int wt[],int W){
        int n=val.length;
        int dp[]=new int[W+1];
        for(int i=wt[0];i<=W;i++){
            dp[i]=val[0];
        }
        for(int i=1;i<n;i++){
            for(int j=W;j>=0;j--){
                int v=val[i];
                int w=wt[i];
                int excProfit=dp[j];
                int incProfit=Integer.MIN_VALUE;
                if(w<=j)    incProfit=v+dp[j-w];
                dp[j]=Math.max(incProfit,excProfit);
                
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int memory[][]=new int[W+1][val.length+1];
        for (int i = 0; i <= W; i++) {
            Arrays.fill(memory[i], -1);
        }
        System.out.println(knapsack(val,wt,W,val.length));
        System.out.println(knapsackMemoization(val,wt,W,val.length,memory));
        System.out.println(knapsackTab(val, wt, W));
        System.out.println(space_optmisation(val, wt, W));
    }
}
