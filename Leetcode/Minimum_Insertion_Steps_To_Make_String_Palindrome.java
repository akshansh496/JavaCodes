package Leetcode;

public class Minimum_Insertion_Steps_To_Make_String_Palindrome {
    public static int minInsertions(String s) {
        int lcs=Longest_Common_Subsequence(s,new StringBuilder(s).reverse().toString());
        return s.length()-lcs;
    }
    public static int Longest_Common_Subsequence(String str1,String str2){
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
        System.out.println(minInsertions("mbadm"));
    }
}
