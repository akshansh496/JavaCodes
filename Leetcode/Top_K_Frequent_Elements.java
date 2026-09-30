package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Top_K_Frequent_Elements {

    static class Info implements Comparable<Info> {

        int num;
        int freq;

        public Info(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }

        public int compareTo(Info obj) {
            return obj.freq - this.freq;
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Info> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            pq.add(new Info(key, map.get(key)));
        }
        int ans[] = new int[k];
        int idx = 0;
        while (k-- > 0) {
            ans[idx++] = pq.poll().num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        int ans[] = topKFrequent(arr, 2);
        System.out.println(Arrays.toString(ans));
    }
}
