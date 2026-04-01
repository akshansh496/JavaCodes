package DP;

import java.util.*;

public class Matrix_Chain_Multiplication {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n=arr.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(memoization(arr, 1, n-1,dp));
        //recursion
        System.out.println(recursion(arr, 1, n-1));
    }

    public static int memoization(int arr[],int i,int j,int dp[][]){
        if(i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=memoization(arr, i, k,dp);
            int cost2=memoization(arr, k+1, j,dp);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans=Math.min(ans,finalCost);
        }
        return dp[i][j]=ans;
    }
    public static int recursion(int arr[],int i,int j){
        if(i==j) return 0;
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=recursion(arr, i, k);
            int cost2=recursion(arr, k+1, j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans=Math.min(ans,finalCost);
        }
        return ans;
    }
}
