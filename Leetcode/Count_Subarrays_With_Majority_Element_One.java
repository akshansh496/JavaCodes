package Leetcode;

public class Count_Subarrays_With_Majority_Element_One {
        public static int countMajoritySubarrays(int[] nums, int target) {
            int count = 0;
    
            for (int i = 0; i < nums.length; i++) {
                int freq = 0;
    
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == target)
                        freq++;
    
                    int len = j - i + 1;
    
                    if (freq > len / 2)
                        count++;
                }
            }
    
            return count;
        }
        public static void main(String[] args) {
            int nums[]={1,2,2,3};
            int target=2;
            System.out.println(countMajoritySubarrays(nums, target));
        }
}
