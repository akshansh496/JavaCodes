package Leetcode;

import java.util.Arrays;

public class Maximum_Alternating_Sum_Of_Squares {

    public static long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long sum = 0;
        for (int i = n - 1; i >= n / 2; i--) {
            sum += (nums[i] * nums[i]);
        }
        for (int i = 0; i < n / 2; i++) {
            sum -= (nums[i] * nums[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[] = {1, -1, 2, -2, 3, -3};
        System.out.println(maxAlternatingSum(nums));
    }
}
