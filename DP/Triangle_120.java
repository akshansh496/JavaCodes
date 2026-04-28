package DP;
import java.util.*;
public class Triangle_120 {
    public static void main(String[] args) {
        int triangle[][] = {{2},{3,4},{6,5,7},{4,1,8,3}};
        System.out.println(recursion(triangle, 0, 0));
        int dp[][]=new int[triangle.length+1][triangle[3].length+1];
        for(int i=0;i<triangle.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(memoization(triangle, 0, 0, dp));
        System.out.println(tabulation(triangle));
    }
    public static int recursion(int triangle[][],int row,int idx){
        if(row==triangle.length)
        return 0;
        int sum= Math.min(recursion(triangle, row+1, idx),recursion(triangle, row+1, idx+1));
        return triangle[row][idx] + sum;
    }
    public static int memoization(int triangle[][],int row,int idx,int dp[][]){
        if(dp[row][idx]!=-1)    return dp[row][idx];
        if(row==triangle.length)
        return 0;
        int sum= Math.min(memoization(triangle, row+1, idx,dp),memoization(triangle, row+1, idx+1,dp));
        return dp[row][idx]=triangle[row][idx] + sum;
    }
    public static int tabulation(int triangle[][]){
        int n=triangle.length;
        int dp[][]=new int[n][n];
        for(int i = 0; i < n; i++) {
            dp[n-1][i] = triangle[n-1][i];
        }

        
        for(int row = n-2; row >= 0; row--) {
            for(int col = 0; col <= row; col++) {
                dp[row][col] = triangle[row][col] +
                               Math.min(dp[row+1][col], dp[row+1][col+1]);
            }
        }

        return dp[0][0];
    }
}
