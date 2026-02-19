package DP;

public class Rod_Cutting {
    public static int tabulation(int value[],int Length[],int rodLength){
        int row=Length.length+1;
        int col=rodLength+1;
        int dp[][]=new int[row][col];
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(Length[i-1]<=j){
                    int incProfit=value[i-1]+dp[i][j-Length[i-1]];
                    int excProfit=dp[i-1][j];
                    dp[i][j]=Math.max(incProfit,excProfit);
                }
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[row-1][col-1];
    }
    public static void main(String[] args) {
        int Length[]={1,2,3,4,5,6,7,8};
        int value[]={1,5,8,9,10,17,17,20};
        int rodLength=8;
        System.out.println(tabulation(value,Length,rodLength));
    }
}
