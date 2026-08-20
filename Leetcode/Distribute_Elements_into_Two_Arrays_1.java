package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distribute_Elements_into_Two_Arrays_1 {
    public static int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<n;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)) arr1.add(nums[i]);
            else    arr2.add(nums[i]);
        }
        int ans[]=new int[n];
        int idx=0;
        while(idx<arr1.size()){
            ans[idx]=arr1.get(idx++);
        }
        idx=0;
        while(idx<arr2.size()){
            ans[arr1.size()+idx]=arr2.get(idx);
            idx++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={2,1,3};
        System.out.println(Arrays.toString(resultArray(nums)));
    }
}
