package Leetcode;

public class Coin_Change {

    public int recursion(int arr[], int idx, int target) {
        if (target < 0) {
            return Integer.MAX_VALUE;
        
        }if (target == 0) {
            return 0;
        
        }if (idx == 0) {
            if (target % arr[0] == 0) 
                return target / arr[0];
            return Integer.MAX_VALUE;
        }
        int pick = Integer.MAX_VALUE;
        if (target >= arr[idx]) {
            int temp = recursion(arr, idx, target - arr[idx]);
            if (temp != Integer.MAX_VALUE) {
                pick = 1 + temp;
            }
        }
        int NotPick = recursion(arr, idx - 1, target);
        return Math.min(pick, NotPick);
    }
    public int memo(int arr[], int idx, int target,int dp[][]) {
        if (target < 0)
            return Integer.MAX_VALUE;
        if (target == 0)
            return 0;
        if (idx == 0) {
            if (target % arr[0] == 0) 
                return target / arr[0];
            return Integer.MAX_VALUE;
        }
        if (dp[idx][target]!=-1) return dp[idx][target];
        int pick = Integer.MAX_VALUE;
        if (target >= arr[idx]) {
            int temp = memo(arr, idx, target - arr[idx],dp);
            if (temp != Integer.MAX_VALUE) {
                pick = 1 + temp;
            }
        }

        int NotPick = memo(arr, idx - 1, target,dp);
        return dp[idx][target]=Math.min(pick, NotPick);
    }
    public int tab(int[] coins, int amount) {
        int len=coins.length;
        int dp[][]=new int[len][amount+1];
        for(int i=0;i<len;i++){
            for(int j=0;j<=amount;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<len;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0) dp[0][i]=i / coins[0];
        }
        for(int i=1;i<len;i++){
            for(int j=1;j<=amount;j++){
                int pick = Integer.MAX_VALUE;
                if (j >= coins[i]){
                    int temp =dp[i][j - coins[i]];
                    if (temp != Integer.MAX_VALUE)
                        pick = 1 + temp;
                }
                int NotPick = dp[i - 1][j];
                dp[i][j]=Math.min(pick, NotPick);
            }
        }
        if(dp[len-1][amount]==Integer.MAX_VALUE) return -1;
        return dp[len-1][amount];
    }
    public int space_optimisation(int[] coins, int amount) {
        int len=coins.length;
        int dp[]=new int[amount+1];
        for(int j=0;j<=amount;j++){
            dp[j]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0) dp[i]=i/coins[0];
        }
        for(int i=1;i<len;i++){
            int curr[]=new int[amount+1];
            for(int j=0;j<=amount;j++){
                curr[j]=Integer.MAX_VALUE;
            }
            curr[0]=0;
            for(int j=1;j<=amount;j++){
                int pick = Integer.MAX_VALUE;
                if (j >= coins[i]){
                    int temp =curr[j - coins[i]];
                    if (temp != Integer.MAX_VALUE)
                        pick = 1 + temp;
                }
                int NotPick = dp[j];
                curr[j]=Math.min(pick, NotPick);
            }
            dp=curr;
        }
        if(dp[amount]==Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
    public static void main(String[] args) {
        
    }
}
