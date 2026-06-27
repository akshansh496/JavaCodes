package Leetcode;

public class Shortest_Common_Supersequence {
    public static StringBuilder shortest_common_supersequencce(String str1, String str2) {
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
                } else {
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
                    ans.append(str1.charAt(idx1-1));
                    idx1--;
                } else {
                    ans.append(str2.charAt(idx2-1));
                    idx2--;
                }
            }
        }
        while(idx1>0)   ans.append(str1.charAt(--idx1));
        while(idx2>0)   ans.append(str2.charAt(--idx2));
        return ans.reverse();
    }
    public static String shortestCommonSupersequence(String str1, String str2) {
        String lcs = tab(str1, str2).toString();
        StringBuilder result = new StringBuilder();

        int i = 0, j = 0, k = 0;

        while (k < lcs.length()) {
            while (i < str1.length() && str1.charAt(i) != lcs.charAt(k)) {
                result.append(str1.charAt(i++));
            }
            while (j < str2.length() && str2.charAt(j) != lcs.charAt(k)) {
                result.append(str2.charAt(j++));
            }
            result.append(lcs.charAt(k++));
            i++;
            j++;
        }

        // Append remaining chars
        result.append(str1.substring(i));
        result.append(str2.substring(j));

        return result.toString();
    }
    public static String tab(String str1, String str2) {
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
    public static int len(String str1,String str2){
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
        String str1 = "abac", str2 = "cab";
        System.out.println(shortest_common_supersequencce(str1, str2));
        System.out.println(shortestCommonSupersequence(str1, str2));
        int lcs=len(str1, str2);
        System.out.println(str1.length()+str2.length()-lcs);
    }
}
