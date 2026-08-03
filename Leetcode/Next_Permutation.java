package Leetcode;

import java.util.Arrays;

public class Next_Permutation {
    public static void nextPermutation(int[] nums) {
        int len=nums.length;
        if(len==1)  return;
        int pivot=Integer.MIN_VALUE;
        for(int i=len-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }   
        }
        if(pivot==Integer.MIN_VALUE){
            reverse(nums,0,len-1);
            return;
        }
        int idx=len-1;
        while(idx>=0){
            if(nums[idx]>nums[pivot]){
                int temp=nums[idx];
                nums[idx]=nums[pivot];
                nums[pivot]=temp;
                break;
            } 
            idx--;
        }
        reverse(nums,pivot+1,len-1);
    }
    public static void reverse(int[] nums,int idx1,int idx2){
        while(idx1<idx2){
            int temp=nums[idx1];
            nums[idx1]=nums[idx2];
            nums[idx2]=temp;
            idx1++;
            idx2--;
        }
    }
    public static void main(String[] args) {
        int nums[]={1,1,5};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
