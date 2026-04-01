package DP;

public class Minimum_Partioning {
    public static void main(String[] args) {
        int numbers[]={1,6,11,5};
        int n=numbers.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=numbers[i];
        }
        int W=sum/2;
        int sum1=tabulation(numbers,n,W);
        int sum2=sum-sum1;
        System.out.println(Math.abs(sum1-sum2));
    }
    public static int tabulation(int numbers[],int n,int W){
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<W+1;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(numbers[i-1]<=j){
                    int include=numbers[i-1]+dp[i-1][j-numbers[i-1]];
                    int exclude=dp[i-1][j];
                    dp[i][j]=Math.max(include,exclude);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
}
