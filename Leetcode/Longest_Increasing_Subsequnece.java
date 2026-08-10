package Leetcode;

import java.util.*;

public class Longest_Increasing_Subsequnece {

    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 2, 3};
        System.out.println(helper(nums, nums.length - 1, nums.length));
        int dp[][] = new int[nums.length][nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(memo(nums, nums.length - 1, nums.length, dp));
        System.out.println(tab(nums));
        System.out.println(space_optimisation(nums));
        System.out.println(helper2(nums));
        print(nums);
        System.out.println(binary_Search(nums));
    }

    public static int helper(int nums[], int i, int prev) {
        if (i < 0) {
            return 0;
        }
        int max;
        if (prev == nums.length) {
            max = Integer.MAX_VALUE; 
        }else {
            max = nums[prev];
        }
        int pick = Integer.MIN_VALUE;
        if (nums[i] < max) {
            pick = 1 + helper(nums, i - 1, i);
        }
        int notPick = helper(nums, i - 1, prev);
        return Math.max(pick, notPick);
    }

    public static int memo(int nums[], int i, int prev, int dp[][]) {
        if (i < 0) {
            return 0;
        }
        int max = (prev == nums.length) ? Integer.MAX_VALUE : nums[prev];
        if (dp[i][prev] != -1) {
            return dp[i][prev];
        }
        int pick = Integer.MIN_VALUE;
        if (nums[i] < max) {
            pick = 1 + memo(nums, i - 1, i, dp);
        }
        int notPick = memo(nums, i - 1, prev, dp);
        return dp[i][prev] = Math.max(pick, notPick);
    }

    public static int tab(int nums[]) {
        int dp[][] = new int[nums.length + 1][nums.length + 1];
        for (int i = 0; i < nums.length + 1; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j <= nums.length; j++) {
                boolean noConstraint = (j == 0);
                int pick = Integer.MIN_VALUE;
                if (noConstraint || nums[i - 1] < nums[j - 1]) {
                    pick = 1 + dp[i - 1][i];
                }
                int notPick = dp[i - 1][j];
                dp[i][j] = Math.max(pick, notPick);
            }
        }
        return dp[nums.length][0];
    }

    public static int space_optimisation(int nums[]) {
        int prev[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length + 1; i++) {
            prev[i] = 0;
        }

        for (int i = 1; i <= nums.length; i++) {
            int curr[] = new int[nums.length + 1];
            for (int j = 0; j <= nums.length; j++) {
                int pick = Integer.MIN_VALUE;
                if (j == 0 || nums[i - 1] < nums[j - 1]) {
                    pick = 1 + prev[i];
                }
                int notPick = prev[j];
                curr[j] = Math.max(pick, notPick);
            }
            prev = curr;
        }
        return prev[0];
    }

    //intutive algo
    public static int helper2(int nums[]) {
        int dp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        int ans = 1;
        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    //print Longest Increasing Subsequence
    public static void print(int nums[]) {
        int dp[] = new int[nums.length];
        int idxArr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            idxArr[i] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    idxArr[i] = j;
                }
            }
        }
        int ans = 1;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] > ans) {
                ans = dp[i];
                idx = i;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (idxArr[idx] != idx) {
            list.add(nums[idx]);
            idx = idxArr[idx];
        }
        list.add(nums[idx]);
        Collections.reverse(list);
        System.out.println(list);
    }

    //using binary search
    /*
    * LIS length via binary search — trace for recall
    * nums = [0, 1, 0, 3, 2, 3]
    * Expected LIS length = 4
    *
    * arr[k] holds the smallest possible TAIL VALUE (not index)
    * for an increasing subsequence of length k+1 found so far.
    * arr stays sorted at all times -> binary search works.
    *
    * num=0 -> arr empty, lo=0 (insert), size 0->1   arr=[0]
    * num=1 -> arr[0]=0 < 1, lo=1 (append)           arr=[0,1]   size=2
    * num=0 -> search [0,1] for first >=0 -> lo=0 (overwrite)
    *                                                    arr=[0,1]   size=2 (unchanged)
    * num=3 -> arr=[0,1], both <3, lo=2 (append)      arr=[0,1,3] size=3
    * num=2 -> search [0,1,3] for first >=2 -> lo=2 (overwrite)
    *                                                    arr=[0,1,2] size=3 (unchanged)
    * num=3 -> arr=[0,1,2], all <3, lo=3 (append)     arr=[0,1,2,3] size=4
    *
    * Final size = 4  ✔ (arr is NOT the actual LIS, just arr bookkeeping —
    * here it happens to equal [0,1,2,3], but that's coincidental to this input)
    *
    * RULE OF THUMB:
    *   - "insert/append" happens when lo == size  -> extends longest subseq
    *   - "overwrite" happens when lo < size       -> found a smaller/equal
    *     tail for an existing length, doesn't change size but improves
    *     future extension chances
    */
    public static int binary_Search(int[] nums) {
        int arr[] = new int[nums.length];
        int size = 0;
        for (int num : nums) {
            int lo = 0, hi = size;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] < num) {
                    lo = mid + 1; 
                }else {
                    hi = mid;
                }
            }
            arr[lo] = num;
            if (lo == size) {
                size++;
            }
        }
        return size;
    }
}
