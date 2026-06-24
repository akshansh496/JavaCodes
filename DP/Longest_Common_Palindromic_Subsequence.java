package DP;

public class Longest_Common_Palindromic_Subsequence {
    public static String Longest_Common_Subsequence(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int dp[][] = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= len2; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]; 
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int idx1 = len1;
        int idx2 = len2;
        StringBuilder ans = new StringBuilder();

        while (idx1 != 0 && idx2 != 0) {
            if (str1.charAt(idx1 - 1) == str2.charAt(idx2 - 1)) {
                ans.append(str1.charAt(idx1 - 1));
                idx1--;
                idx2--;
            } else {
                if (dp[idx1 - 1][idx2] > dp[idx1][idx2 - 1]) {
                    idx1--; 
                }else {
                    idx2--;
                }
            }
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String s="bbbab";
        System.out.println(Longest_Common_Subsequence(s, new StringBuilder(s).reverse().toString()));
    }
}
