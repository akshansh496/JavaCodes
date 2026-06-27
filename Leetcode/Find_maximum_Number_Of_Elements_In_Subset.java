package Leetcode;
// You are given an array of positive integers nums.

// You need to select a subset of nums which satisfies the following condition:

// You can place the selected elements in a 0-indexed array such that it follows the pattern: [x, x2, x4, ..., xk/2, xk, xk/2, ..., x4, x2, x] (Note that k can be be any non-negative power of 2). For example, [2, 4, 16, 4, 2] and [3, 9, 3] follow the pattern while [2, 4, 8, 4, 2] does not.
// Return the maximum number of elements in a subset that satisfies these conditions.

import java.util.HashMap;
import java.util.Set;

public class Find_maximum_Number_Of_Elements_In_Subset {
    public static int maximumLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer> set=map.keySet();
        int max=1;
        for(Integer num:set){
            if (num == 1) {
                int ones = map.get(1);
                max = Math.max(max, ones % 2 == 0 ? ones - 1 : ones);
                continue;
            }
            int count=0;
            long current = num;
            while (current <= Integer.MAX_VALUE          
                    && map.containsKey((int) current) 
                    && map.get((int) current) >= 2
                    && map.containsKey((int)(current * current))) {
                count += 2;
                current = current * current;
            }

            if (current <= Integer.MAX_VALUE             
                    && map.containsKey((int) current)) {
                count += 1;
            }

            max = Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={5,4,1,2,2};
        System.out.println(maximumLength(nums));
    }
}
