package Leetcode;

import java.util.*;

public class Minimum_Falling_Path_Sum {
    public static int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=matrix[m-1][i];
        }
        for(int i=m-2;i>=0;i--){
            int curr[]=new int[n];
            for(int j=0;j<n;j++){
                int left=Integer.MAX_VALUE;
                int below=dp[j];
                int right=Integer.MAX_VALUE;
                if(j>0) left=dp[j-1];
                if(j<n-1)   right=dp[j+1];
                curr[j]=matrix[i][j]+Math.min(Math.min(left,below),right);
            }
            dp=curr;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,dp[i]);
        }
        return min;
    }
    public static int recursion(int[][] matrix,int row,int idx){
        if(row==matrix.length-1)    return matrix[row][idx];
        int left=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        if(idx>0)   left=recursion(matrix, row+1, idx-1);
        if(idx<matrix[0].length-1)  right=recursion(matrix, row+1, idx+1);
        int down=recursion(matrix, row+1, idx);
        return matrix[row][idx]+Math.min(down,Math.min(left,right));
    }
    public static int memo(int[][] matrix,int row,int idx,int dp[][]){
        if(row==matrix.length-1)    return dp[row][idx] = matrix[row][idx];
        if(dp[row][idx]!=-1) return dp[row][idx];
        int left=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        if(idx>0)   left=memo(matrix, row+1, idx-1,dp);
        if(idx<matrix[0].length-1)  right=memo(matrix, row+1, idx+1,dp);
        int down=memo(matrix, row+1, idx,dp);
        return dp[row][idx]=matrix[row][idx]+Math.min(down,Math.min(left,right));
    }
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int m=matrix.length;
        int n=matrix[0].length;
        //dp(space-optimised)
        System.out.println(minFallingPathSum(matrix));

        //recursion
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,recursion(matrix, 0, i));
        }
        System.out.println(min);

        //memoization
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)    Arrays.fill(dp[i], -1);
        min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,memo(matrix, 0, i,dp));
        }
        System.out.println(min);
    }
}
