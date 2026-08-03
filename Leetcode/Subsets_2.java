package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets_2 {
    static Set<List<Integer>> set;
    static public List<List<Integer>> subsetsWithDup(int[] nums) {
        set=new HashSet<>();
        Arrays.sort(nums);
        helper(nums,0,new ArrayList<>());
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> item:set){
            ans.add(item);
        }
        return ans;
    }
    public static void helper(int[] nums,int idx,List<Integer> subList){
        if(idx==nums.length){
            set.add(new ArrayList<>(subList));
            return;
        }
        subList.add(nums[idx]);
        helper(nums,idx+1,subList);
        subList.remove(subList.size()-1);
        helper(nums,idx+1,subList);
    }
    public static void main(String[] args) {
        int nums[]={4,4,4,1,4};
        System.out.println(subsetsWithDup(nums));
    }
}
