package Leetcode;

public class Maximum_Total_Subarray_Value_One {
        public static long maxTotalValue(int[] nums, int k) {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                min=Math.min(min,nums[i]);
                max=Math.max(max,nums[i]);
            }
            return (1L*k*(max-min));
        }
        public static void main(String[] args) {
            int nums[]={1,3,2};
            System.out.println(maxTotalValue(nums,2));
        }
}
