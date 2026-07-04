package Leetcode;
import java.util.*;
public class Distinct_Subsequences {
    public static void numDistinct(String s, String t) {
        int i=s.length();
        int j=t.length();

        //recursion
        System.out.println(recursion(s,t,i-1,j-1));

        //memoization
        int dp[][]=new int[i+1][j+1];
        for(int idx=0;idx<=i;idx++){
            Arrays.fill(dp[idx],-1);
        }
        System.out.println(memo(s,t,i,j,dp));

        //tabulation
        System.out.println(tabulation(s,t));

        //space optimisation
        System.out.println(space_optimisation(s,t));

        //more space optimisation
        System.out.println(more_space_optimisation(s,t));
    }
    public static int recursion(String s,String t,int i,int j){
        if(j<0) return 1;
        if(i<0) return 0;
        if(s.charAt(i)==t.charAt(j))
            return recursion(s,t,i-1,j-1)+recursion(s,t,i-1,j);
        else 
            return recursion(s,t,i-1,j);
    }
    public static int memo(String s,String t,int i,int j,int dp[][]){
        if(j==0) return 1;
        if(i==0) return 0;
        if(dp[i][j]!=-1)    return dp[i][j];
        if(s.charAt(i-1)==t.charAt(j-1))
            return dp[i][j]=memo(s,t,i-1,j-1,dp)+memo(s,t,i-1,j,dp);
        else 
            return dp[i][j]=memo(s,t,i-1,j,dp);
    }
    public static int tabulation(String s,String t){
        int i=s.length();
        int j=t.length();
        int dp[][]=new int[i+1][j+1];
        for(int idx=0;idx<=i;idx++){
            dp[idx][0]=1;
        }
        for(int idx=1;idx<=i;idx++){
            for(int jIdx=1;jIdx<=j;jIdx++){
                if(s.charAt(idx-1)==t.charAt(jIdx-1))
                    dp[idx][jIdx]=dp[idx-1][jIdx-1]+dp[idx-1][jIdx];
                else 
                    dp[idx][jIdx]=dp[idx-1][jIdx];
            }
        }
        return dp[i][j];
    }
    public static int space_optimisation(String s,String t){
        int i=s.length();
        int j=t.length();
        int prev[]=new int[j+1];
        prev[0]=1;
        for(int idx=1;idx<=i;idx++){
            int curr[]=new int[j+1];
            curr[0]=1;
            for(int jIdx=1;jIdx<=j;jIdx++){
                if(s.charAt(idx-1)==t.charAt(jIdx-1))
                    curr[jIdx]=prev[jIdx-1]+prev[jIdx];
                else 
                    curr[jIdx]=prev[jIdx];
            }
            prev=curr;
        }
        return prev[j];
    }
    public static int more_space_optimisation(String s,String t){
        int i=s.length();
        int j=t.length();
        int dp[]=new int[j+1];
        dp[0]=1;
        for(int idx=1;idx<=i;idx++){
            for(int jIdx=j;jIdx>0;jIdx--){
                if(s.charAt(idx-1)==t.charAt(jIdx-1))
                    dp[jIdx]=dp[jIdx-1]+dp[jIdx];
            }
        }
        return dp[j];
    }
    public static void main(String[] args) {
        String s = "rabbbit", t = "rabbit";
        numDistinct(s, t);
    }
}
