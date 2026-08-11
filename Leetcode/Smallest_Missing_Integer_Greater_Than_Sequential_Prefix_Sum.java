package Leetcode;

import java.util.HashSet;

public class Smallest_Missing_Integer_Greater_Than_Sequential_Prefix_Sum {
    public static void main(String[] args) {
        int nums[]={14,9,6,9,7,9,10,4,9,9,4,4};
        System.out.println(missingInteger(nums));
    }
    public static int missingInteger(int[] nums) {
        if(nums.length==1)  return nums[0]+1;
        HashSet<Integer> set=new HashSet<>();
        int sum=nums[0];
        for(int num:nums){
            set.add(num);
        }
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
                max=Math.max(max,sum);
            }    
            else    break;
        }
        while(set.contains(max))    max++;
        return max;
    }
}
