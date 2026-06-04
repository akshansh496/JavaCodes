package Leetcode;

public class Unique_Paths_Two {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1) return 0;
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        int value=1;
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0]==1)   value=0;
            dp[i][0]=value;
        }
        value=1;
        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i]==1)   value=0;
            dp[0][i]=value;   
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }  
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        int arr[][]={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(arr));
    }
}
