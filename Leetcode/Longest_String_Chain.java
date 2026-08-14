package Leetcode;

import java.util.Arrays;

public class Longest_String_Chain {
    public static void main(String[] args) {
        String[] words={"a","b","ba","abc","abd","bdca"};
        System.out.println(longestStrChain(words));
    }
    public static int longestStrChain(String[] words) {
        Arrays.sort(words, (x, y) -> x.length() - y.length());
        int dp[]=new int[words.length];
        for(int i=0;i<words.length;i++){
            dp[i]=1;
        }
        for(int i=1;i<words.length;i++){
            for(int j=0;j<i;j++){
                if(compare(words[j],words[i])){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
        }
        int ans=1;
        for(int i=0;i<words.length;i++){
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
    public static boolean compare(String str1,String str2){
        if(str2.length()!=str1.length()+1)  return false;
        int i=0,j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)!=str2.charAt(j))  j++;
            else{
                i++;
                j++;
            }
        }
        return i==str1.length();
    }
}
