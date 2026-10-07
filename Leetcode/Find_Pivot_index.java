package Leetcode;

public class Find_Pivot_index {

    public static void main(String[] args) {
        int nums[] = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int left = -1;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            if ((totalSum - nums[i] - leftSum) == leftSum) {
                left = i;
                break;
            }
            leftSum += nums[i];
        }
        return left;
    }
}
