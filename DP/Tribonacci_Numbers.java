package DP;
import java.util.*;
public class Tribonacci_Numbers {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<5;i++){
            System.out.print(recursion(i)+",");
        } 
        System.out.println();
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(memoization(n-1, dp));
        System.out.println(tabulation(5));
    }
    public static int recursion(int n){
        if(n==0 || n==1)
        return 0;
        else if(n==2)
        return 1;
        else
        return recursion(n-1)+recursion(n-2)+recursion(n-3);
    }
    public static int memoization(int n,int dp[]){
        if(dp[n]!=-1) return dp[n];
        if(n==0 || n==1)
        dp[n]= 0;
        else if(n==2)
        dp[n]=1;
        else
        dp[n]=memoization(n-1, dp)+memoization(n-2, dp)+memoization(n-3, dp);
        return dp[n];
    }
    public static int tabulation(int n){
        if(n == 0 || n == 1) return 0;
        if(n == 2) return 1;
        int dp[]=new int[n];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n-1];
    }
}
