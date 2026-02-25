package DP;
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
        System.out.println(tabulation(word1, word2));
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
}
