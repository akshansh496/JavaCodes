package Leetcode;

import java.util.Arrays;

public class Sort_Colors {
        public static void sortColors(int[] nums) {
            int low=0;
            int mid=0;
            int high=nums.length-1;
            while(mid<=high){
                if(nums[mid]==0){
                    int temp=nums[mid];
                    nums[mid]=nums[low];
                    nums[low]=temp;
                    mid++;
                    low++;
                }
                else if(nums[mid]==2){
                    int temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    high--;
                }
                else    mid++;
            }
        }
    public static void main(String[] args) {
        int nums[]={2,1,0,1,1,0,2,2,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
