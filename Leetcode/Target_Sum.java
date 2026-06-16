package Leetcode;
// Let S1 be the subset assigned '+' signs and S2 be the subset assigned '-' signs.
//
// We know:
// S1 - S2 = target
// S1 + S2 = totalSum
//
// Adding both equations:
// 2 * S1 = target + totalSum
// S1 = (target + totalSum) / 2
//
// Therefore, the problem reduces to:
// "Count the number of subsets whose sum is S1."
//
// We store this required subset sum in k.
public class Target_Sum {
    public static int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if (Math.abs(target) > sum) return 0;
        if ((target + sum) % 2 != 0) return 0;
        int k=(target+sum)/2;
        int dp[][]=new int[n][k+1];
        if (nums[0] == 0)
            dp[0][0] = 2;
        else {
            dp[0][0] = 1;
            if (nums[0] <= k)
                dp[0][nums[0]] = 1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=k;j++){
                int notPick=dp[i-1][j];
                int pick=0;
                if(nums[i]<=j)   pick=dp[i-1][j-nums[i]];
                dp[i][j]= pick+notPick;
            }
        }
        return dp[n-1][k];
    }
    public static int space_optimised(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        if (Math.abs(target) > sum) return 0;
        if ((target + sum) % 2 != 0) return 0;

        int k=(target+sum)/2;
        int prev[]=new int[k+1];
        if (nums[0] == 0)
            prev[0] = 2;
        else {
            prev[0] = 1;
            if (nums[0] <= k)
                prev[nums[0]] = 1;
        }
        for(int i=1;i<n;i++){
            int curr[]=new int[k+1];
            for(int j=0;j<=k;j++){
                int notPick=prev[j];
                int pick=0;
                if(nums[i]<=j)   pick=prev[j-nums[i]];
                curr[j]= pick+notPick;
            }
            prev=curr;
        }
        return prev[k];
    }
    public static int more_space_optimised(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        if (Math.abs(target) > sum) return 0;
        if ((target + sum) % 2 != 0) return 0;

        int k=(target+sum)/2;
        int prev[]=new int[k+1];
        if (nums[0] == 0)
            prev[0] = 2;
        else {
            prev[0] = 1;
            if (nums[0] <= k)
                prev[nums[0]] = 1;
        }
        for(int i=1;i<n;i++){
            for(int j=k;j>=0;j--){
                int notPick=prev[j];
                int pick=0;
                if(nums[i]<=j)   pick=prev[j-nums[i]];
                prev[j]= pick+notPick;
            }
        }
        return prev[k];
    }
    public static void main(String[] args) {
        int nums[]={1,1,1,1,1};
        int target=3;
        System.out.println(findTargetSumWays(nums,target));
        System.out.println(space_optimised(nums, target));
        System.out.println(more_space_optimised(nums, target));
    }
}
