package DP;

public class Min_Insertions_Deletions_To_Convert_String_A_To_B {
    public static int longest_common_subsequence(String str1,String str2){
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
        String a="leet";
        String b="aksh";
        int common=longest_common_subsequence(a, b);
        System.out.println((a.length()-common)+(b.length()-common));
    }
}
