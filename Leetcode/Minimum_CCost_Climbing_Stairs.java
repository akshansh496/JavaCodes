package Leetcode;
// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

// You can either start from the step with index 0, or the step with index 1.

// Return the minimum cost to reach the top of the floor.
public class Minimum_CCost_Climbing_Stairs {
    // public static void main(String[] args) {
    //     int cost[]={1,100,1,1,1,100,1,1,100,1};
    //     int n=cost.length;
    //     int dp[]=new int[n+1];
    //     dp[0]=cost[0];
    //     dp[1]=cost[1];
    //     for(int i=2;i<n;i++){
    //         int first=cost[i]+dp[i-1];
    //         int second=cost[i]+dp[i-2];
    //         dp[i]=Math.min(first,second);
    //     }
    //     System.out.println(Math.min(dp[n - 1], dp[n - 2]));
    // }


    // Space-optmisation
    public static void main(String[] args) {
        int cost[]={1,100,1,1,1,100,1,1,100,1};
        int n=cost.length;
        int prev2=cost[0];
        int prev=cost[1];
        for(int i=2;i<n;i++){
            int first=cost[i]+prev;
            int second=cost[i]+prev2;
            int curr=Math.min(first,second);
            prev2=prev;
            prev=curr;
        }
        System.out.println(Math.min(prev,prev2));
    }
}
