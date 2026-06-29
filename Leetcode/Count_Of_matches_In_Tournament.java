package Leetcode;

public class Count_Of_matches_In_Tournament {
    public static int numberOfMatches(int n) {
        // if(n==1)    return 0;
        // int dp[]=new int[n+1];
        // dp[1]=0;
        // dp[2]=1;
        // for(int i=3;i<=n;i++){
        //     if((i)%2==0)  dp[i]=i/2+dp[i/2];
        //     else    dp[i]=(i-1)/2+dp[(i-1)/2+1];
        // }
        // return dp[n];
        return n-1;//Every match eliminates exactly 1 team. To get from n teams → 1 winner, you must eliminate n-1 teams → always n-1 matches.
    }
    public static void main(String[] args) {
        System.out.println(numberOfMatches(14));
    }
}
