package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Find_Missing_Elements {
    public static List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int arr[]=new int[101];
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
            arr[nums[i]]++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(arr[i]==0)   ans.add(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={1,4,2,5};
        System.out.println( findMissingElements(nums));
    }
}
