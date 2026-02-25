package DP;

import java.util.Scanner;

/*
Given a text and a wildcard pattern, implement wildcard pattern matching algorithm that finds if wildcard pattern is matched with text. The matching should cover the entire text (not partial text). The wildcard pattern can include the characters?' and *'
• *?' - matches any single character
• "*' - Matches any sequence of characters (including the empty sequence)
 */
public class Wildcard_Matching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        String pattern=sc.next();
        System.out.println(tabulation(text, pattern));
    }
    public static boolean tabulation(String text,String pattern){
        int n=text.length();
        int m=pattern.length();
        boolean dp[][]=new boolean[n+1][m+1];
        //agar pattern ki length zero h to usko kabhi text me convert nhi kr payenge
        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }
        //agar pattern aur text dono zero length ke h to wo already same h
        dp[0][0]=true;
        //agar text ki length zero h
        for(int i=1;i<m+1;i++){
            if(pattern.charAt(i-1)!='*')
            dp[0][i]=false;
            else{
                dp[0][i]=dp[0][i-1];
            }
        }
        //initialisation done
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(text.charAt(i-1)==pattern.charAt(j-1) || pattern.charAt(j-1)=='?')
                dp[i][j]=dp[i-1][j-1];
                else if(pattern.charAt(j-1)=='*')
                //yaha pe dp[i][j-1] * ko ignore kiya h aur dp[i-1][j] isme * ko replace kiya h text ke last
                // alphabet se to i-1 hogya lekin * ek se jyada alphabets replace kr skta h isliye j waisa hi
                // rahega
                dp[i][j]= dp[i][j-1] || dp[i-1][j];
                else
                dp[i][j]=false;
            }
        }
        return dp[n][m];
    }
}
