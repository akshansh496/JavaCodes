package DP;

public class Longest_Common_Substring {
    public static int tabulation(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        int max=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    max=Math.max(max,dp[i][j]);
                }
                else
                dp[i][j]=0;
            }
        }
        return max;
    }
    public static int space_optimisation(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int prev[]=new int[m+1];
        int max=0;
        for(int i=1;i<n+1;i++){
            int curr[]=new int[m+1];
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    curr[j]=1+prev[j-1];
                    max=Math.max(max,curr[j]);
                }
                else
                curr[j]=0;
            }
            prev=curr;
        }
        return max;
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="abgce";
        System.out.println(tabulation(str1, str2));
        System.out.println(space_optimisation( , str2));
    }
}
