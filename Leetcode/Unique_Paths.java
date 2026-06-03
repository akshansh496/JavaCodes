package Leetcode;
import java.util.*;
public class Unique_Paths {
    public static void main(String[] args) {
        int row=3;
        int col=7;
        
        System.out.println(recursion(row-1,col-1));

        int dp[][]=new int[row][col];
        for(int i=0;i<row;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(memo(row-1, col-1, dp));

        System.out.println(uniquePaths(row, col));
        System.out.println(space_optimisation(row, col));
    }
    public static int recursion(int row,int col){
        if(row==0 || col==0) return 1;
        if(row<0 || col<0) return 0;
        return recursion(row-1,col)+recursion(row, col-1);
    }
    public static int memo(int row,int col,int dp[][]){
        if(row==0 || col==0) return 1;
        if(row<0 || col<0) return 0;
        if(dp[row][col]!=-1) return dp[row][col];
        return dp[row][col]=memo(row-1,col,dp)+memo(row, col-1,dp);
    }
    public static int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public static int space_optimisation(int m, int n) {
        int prevRow[]=new int[n];
        Arrays.fill(prevRow,1);
        for(int i=1;i<m;i++){
            int currRow[] = new int[n];
            currRow[0] = 1;

            for (int j = 1; j < n; j++) {
                currRow[j] = currRow[j - 1] + prevRow[j];
            }

            prevRow = currRow;
        }
        return prevRow[n - 1];
    }
}
