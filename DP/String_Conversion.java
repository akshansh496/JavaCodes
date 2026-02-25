package DP;
/*
Convert String1 to String2 with only insertion & deletion.
Print number of deletions & insertions.
str1 = "pear" str2 ="sea"
 */
public class String_Conversion {
    static int NoInsert=0;
    static int NoDeletion=0;
    public static void main(String[] args) {
        String word1="pear";
        String word2="sea";
        int lcs=lcs(word1, word2);
        System.out.println("No. of deletions : " + (word1.length()-lcs));
        System.out.println("No. of Insertions : " + (word2.length()-lcs));
    }
    public static int lcs(String str1,String str2){
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
}
