package Leetcode;

public class Number_of_Zero_Filled_Subarrays {
    public static long zeroFilledSubarray(int[] nums) {
        long consecutive = 0;
        long totalCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                totalCount += consecutive + 1;
                consecutive++;
            } else
                consecutive = 0;
        }
        return totalCount;
    }
    public static void main(String[] args) {
        int nums[]={1,3,0,0,2,0,0,4};
        System.out.println(zeroFilledSubarray(nums));
    }
}
