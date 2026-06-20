package Leetcode;

import java.util.*;

public class Longest_Common_Subsequence {
    public static int recursion(int idx1,int idx2,String str1,String str2){
        if(idx1<0 || idx2<0) return 0;  
        if(str1.charAt(idx1)==str2.charAt(idx2)){
            return 1+recursion(idx1-1, idx2-1, str1, str2);
        }
        return Math.max(recursion(idx1-1,idx2,str1,str2),recursion(idx1, idx2-1, str1, str2));
    }
    public static int memo(int idx1,int idx2,String str1,String str2,int dp[][]){
        if(idx1<0 || idx2<0) return 0;  
        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
        if(str1.charAt(idx1)==str2.charAt(idx2)){
            return dp[idx1][idx2]=1+memo(idx1-1, idx2-1, str1, str2,dp);
        }
        return dp[idx1][idx2]=Math.max(memo(idx1-1,idx2,str1,str2,dp),memo(idx1, idx2-1, str1, str2,dp));
    }
    public static int tab(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        int dp[][]=new int[len1+1][len2+1];
        for(int i=0;i<=len1;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=len2;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))  dp[i][j]=1+dp[i-1][j-1];
                else    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[len1][len2]; 
    }
    public static int space_optmisation(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        int prev[]=new int[len2+1];
        for(int i=0;i<=len2;i++){
            prev[i]=0;
        }
        for(int i=1;i<=len1;i++){
            int curr[]=new int[len2+1];
            for(int j=1;j<=len2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))  curr[j]=1+prev[j-1];
                else    curr[j]=Math.max(prev[j],curr[j-1]);
            }
            prev=curr;
        }
        return prev[len2]; 
    }
    public static void main(String[] args) {
        String str1="cde";
        String str2="ace";
        int len1=str1.length();
        int len2=str2.length();
        System.out.println(recursion(len1-1, len2-1, str1, str2));
        int dp[][]=new int[len1][len2];
        for(int i=0;i<len1;i++){ 
            Arrays.fill(dp[i], -1);
        }
        System.out.println(memo(len1-1, len2-1, str1, str2, dp));
        System.out.println(tab(str1, str2));
        System.out.println(space_optmisation(str1, str2));
    }
}
