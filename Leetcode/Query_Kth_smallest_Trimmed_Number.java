package Leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Query_Kth_smallest_Trimmed_Number {
    static class Info implements Comparable<Info> {
        String num;
        int idx;

        Info(String num, int idx) {
            this.num = num;
            this.idx = idx;
        }

        public int compareTo(Info o) {
            int cmp = num.compareTo(o.num);
            if (cmp == 0)
                return idx - o.idx;
            return cmp;
        }
    }

    public static int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int len = queries.length;
        int ans[] = new int[len];
        for (int i = 0; i < len; i++) {
            int k = queries[i][0];
            int trim = queries[i][1];
            PriorityQueue<Info> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = 0; j < nums.length; j++) {
                String num = nums[j].substring(nums[j].length() - trim);
                pq.add(new Info(num, j));
            }
            while (pq.size() != k) {
                pq.poll();
            }
            ans[i] = pq.poll().idx;
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] nums = {"102","473","251","814"};
        int[][] queries = {{1,1},{2,3},{4,2},{1,2}};
        int arr[]=smallestTrimmedNumbers(nums, queries);
        System.out.println(Arrays.toString(arr));
    }
}
