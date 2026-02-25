package DP;

public class Catalan_Number {
    
    public static void main(String[] args) {
        int n=4;
        System.out.println(catalan(n));
        int dp[]=new int [n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=-1;
        }
        System.out.println(catalan2(n,dp));
        System.out.println(catalan3(n));
    }
    //recursion
    public static int catalan(int n){
        if(n==0 || n==1) return 1;
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=catalan(i)*catalan(n-1-i);
        }
        return ans;
    }
    //memoization
    public static int catalan2(int n,int dp[]){
        if(dp[n]!=-1) return dp[n];
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=catalan2(i,dp)*catalan2(n-1-i,dp);
        }
        return dp[n]=ans;
    }
    //tabulation
    public static int catalan3(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i] += dp[j] * dp[i-1-j];
            }
        }
        return dp[n];
    }
}
