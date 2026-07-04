package DP;

import java.util.*;

/*
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
You have the following three operations permitted on a word:
• Insert a character 
• Delete a character
• Replace a character
 */
public class Edit_Distance {
    public static void main(String[] args) {
        String word1="intention";
        String word2="execution";
        int len1=word1.length();
        int len2=word2.length();
        System.out.println(recursion(word1, word2,len1-1, len2-1));
        int dp[][]=new int [len1][len2];
        for(int i=0;i<len1;i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(memo(word1, word2, len1-1, len2-1, dp));
        System.out.println(tabulation(word1, word2));
        System.out.println(space_optimisation(word1, word2));
    }
    public static int recursion(String word1,String word2,int i,int j){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(word1.charAt(i)==word2.charAt(j))    return recursion(word1, word2, i-1, j-1);
        else    return 1+Math.min(recursion(word1,word2,i-1,j-1),Math.min(recursion(word1, word2, i, j-1),recursion(word1, word2, i-1, j)));
    }
    public static int memo(String word1,String word2,int i,int j,int dp[][]){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1)    return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j))    return dp[i][j]=memo(word1, word2, i-1, j-1,dp);
        else    return dp[i][j]=1+Math.min(memo(word1,word2,i-1,j-1,dp),Math.min(memo(word1, word2, i, j-1,dp),memo(word1, word2, i-1, j,dp)));
    }
    public static int tabulation(String word1,String word2){
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n+1][m+1];
        //agar ek string khaali h to usko duusre ki length jitne steps lagenge(initialisation logic)
        for (int i = 0; i <= n; i++)
        dp[i][0] = i;
        for (int j = 0; j <= m; j++)
        dp[0][j] = j;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                dp[i][j]=dp[i-1][j-1];
                else{
                    // insert
                    int insert = 1 + dp[i][j-1];
                    // delete
                    int delete = 1 + dp[i-1][j];
                    // replace
                    int replace = 1 + dp[i-1][j-1];

                    dp[i][j]= Math.min(insert,Math.min(delete,replace));
                }
            }
        }
        return dp[n][m];
    }
    public static int space_optimisation(String word1,String word2){
        int n=word1.length();
        int m=word2.length();
        int prev[]=new int[m+1];
        for (int j = 0; j <= m; j++)
        prev[j] = j;
        for(int i=1;i<n+1;i++){
            int curr[]=new int[m+1];
            curr[0]=i;
            for(int j=1;j<m+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                curr[j]=prev[j-1];
                else{
                    // insert
                    int insert = 1 + curr[j-1];
                    // delete
                    int delete = 1 + prev[j];
                    // replace
                    int replace = 1 + prev[j-1];

                    curr[j]= Math.min(insert,Math.min(delete,replace));
                }
            }
            prev=curr;
        }
        return prev[m];
    }
}
