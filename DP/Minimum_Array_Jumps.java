package DP;

public class Minimum_Array_Jumps {
    public static void main(String[] args) {
        // Input array where each element represents
        // max jump length from that index
        int arr[]={2,3,1,1,4};
        int n=arr.length;
        // dp[i] will store minimum jumps needed
        // to reach end from index i
        int dp[]=new int[n];
         // Initialize all positions as unreachable (-1)
        for(int i=0;i<n-1;i++){
            dp[i]=-1;
        }
        // Base case: last index needs 0 jumps
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
             // Start with maximum value (means not reachable yet)
            int ans=Integer.MAX_VALUE;
            // Try all possible jumps from index i
            // j goes from next index to max reachable index
            for(int j=i+1;j<=i+arr[i] && j<n;j++){
                // Only consider reachable positions
                if(dp[j] != -1)
                ans=Math.min(ans,dp[j]+1);
            }
            // If we found a valid path, update dp[i]
            if(ans!=Integer.MAX_VALUE)
            dp[i]=ans;
            // else dp[i] remains -1 (unreachable)
        }
        // Answer: minimum jumps from index 0
        System.out.println(dp[0]);
    }
}
