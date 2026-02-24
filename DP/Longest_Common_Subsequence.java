package DP;

public class Longest_Common_Subsequence {
    //recursion
    public static int recursion(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1))
        return 1+recursion(str1,str2,n-1,m-1);
        else{
            return Math.max(recursion(str1,str2,n-1,m),recursion(str1,str2,n,m-1));
        }
    }
    //memoization
    public static int memoization(String str1,String str2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1)
        return dp[n][m];
        if(str1.charAt(n-1)==str2.charAt(m-1))
            return dp[n][m]=1+memoization(str1,str2,n-1,m-1,dp);
        else
            return dp[n][m]= Math.max(memoization(str1,str2,n-1,m,dp),memoization(str1,str2,n,m-1,dp));
    }
    //tabulation
    public static int tabulation(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="ace";
        int n=str1.length();
        int m=str2.length();
        System.out.println(recursion(str1,str2,n,m));
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(memoization(str1, str2, n, m, dp));
        System.out.println(tabulation(str1, str2));
    }
}
