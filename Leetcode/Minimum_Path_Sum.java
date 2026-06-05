package Leetcode;
import java.util.*;
public class Minimum_Path_Sum {
        public static int recursion(int[][] grid,int i,int j) {
            if(i==0 && j==0)    return grid[i][j];
            if(i<0 || j<0) return  Integer.MAX_VALUE;
            return grid[i][j]+Math.min(recursion(grid, i-1, j),recursion(grid, i, j-1));
        }
        public static int memo(int[][] grid,int i,int j,int dp[][]) {
            if(i==0 && j==0)    return grid[i][j];
            if(i<0 || j<0) return  Integer.MAX_VALUE;
            if(dp[i][j]!=-1) return dp[i][j];
            return dp[i][j]=grid[i][j]+Math.min(memo(grid, i-1, j,dp),memo(grid, i, j-1,dp));
        }
        public static int tab(int[][] grid) {
            int m=grid.length;
            int n=grid[0].length;
            int dp[][]=new int[m][n];
            dp[0][0]=grid[0][0];
            for(int i=0;i<m;i++){
                int up=Integer.MAX_VALUE;
                int left=Integer.MAX_VALUE;
                for(int j=0;j<n;j++){
                    if(i==0 && j==0)    continue;
                    if(i>0) up=dp[i-1][j];
                    else    up=Integer.MAX_VALUE;
                    if(j>0) left=dp[i][j-1];
                    else    left=Integer.MAX_VALUE;
                    dp[i][j]=grid[i][j]+Math.min(up,left);
                }
            }
            return dp[m-1][n-1];
        }  

        public static int space_optmisation(int[][] grid) {
            int m=grid.length;
            int n=grid[0].length;
            int prev[]=new int[n];
            for(int i=0;i<m;i++){
                int curr[]=new int[n];
                for(int j=0;j<n;j++){
                    if(i==0 && j==0){
                        curr[j]=grid[i][j];
                        continue;
                    }    
                    int up=Integer.MAX_VALUE;
                    int left=Integer.MAX_VALUE;
                    if(i>0) up=prev[j];
                    if(j>0) left=curr[j-1];
                    curr[j]=grid[i][j]+Math.min(up,left);
                }
                prev=curr;
            }
            return prev[n-1];
        }
        public static void main(String[] args) {
            int grid[][]={{1,3,1},{1,5,1},{4,2,1}};
            System.out.println(recursion(grid, grid.length-1, grid[0].length-1));

            int dp[][]=new int[grid.length][grid[0].length];
            for(int i=0;i<grid.length;i++){
                Arrays.fill(dp[i],-1);
            }
            System.out.println(memo(grid, grid.length-1, grid[0].length-1 , dp));
            System.out.println(tab(grid));
            System.out.println(space_optmisation(grid));
        }
}
