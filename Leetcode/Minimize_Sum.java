package Leetcode;

import java.util.Arrays;

public class Minimize_Sum {

    public static int minimizeSum(int[] nums) {
        if (nums.length == 3) {
            return 0;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            min = Math.min(nums[i + nums.length - 3] - nums[i], min);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {59, 27, 9, 81, 33};
        System.out.println(minimizeSum(nums));
    }
}
