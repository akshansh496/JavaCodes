package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Count_Number_Of_Nice_Subarrays {

    public static void main(String[] args) {
        int nums[] = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        System.out.println(numberOfSubarrays(nums, 2));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int count[] = new int[n];
        count[0] = ((nums[0] & 1) == 0) ? 0 : 1;
        for (int i = 1; i < n; i++) {
            if ((nums[i] & 1) != 0) {
                count[i] = count[i - 1] + 1; 
            }else {
                count[i] = count[i - 1];
            }
        }
        System.out.println(Arrays.toString(count));
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            if (map.containsKey(count[i] - k)) {
                ans += map.get(count[i] - k);
            }
            map.put(count[i], map.getOrDefault(count[i], 0) + 1);
        }
        return ans;
    }
}
