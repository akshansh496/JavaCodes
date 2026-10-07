package Leetcode;

import java.util.Arrays;
import java.util.TreeSet;

public class Maximize_Sum_Of_Atmost_K_Distinct_elements {

    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 2, 2, 2};
        int ans[] = maxKDistinct(nums, 6);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] maxKDistinct(int[] nums, int k) {
        int n = nums.length;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int size = Math.min(k, set.size());
        int ans[] = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = set.pollLast();
        }
        return ans;
    }
}
