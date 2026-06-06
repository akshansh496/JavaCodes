package Leetcode;

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
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum(matrix));
    }
}
