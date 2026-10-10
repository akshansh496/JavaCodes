package Leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class Minimum_Sum_Of_Squarred_Differences {

    public static void main(String[] args) {
        int nums1[] = {1, 4, 10, 12};
        int nums2[] = {5, 8, 6, 9};
        int k1 = 1;
        int k2 = 1;
        System.out.println(minSumSquareDiff(nums1, nums2, k1, k2));
    }

    public static long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            pq.add(Math.abs(nums1[i] - nums2[i]));
        }
        while (k1-- > 0) {
            int temp = pq.poll();
            if (temp == 0) {
                pq.add(temp);
                break;
            }
            pq.add(temp - 1);
        }
        while (k2-- > 0) {
            int temp = pq.poll();
            if (temp == 0) {
                pq.add(temp);
                break;
            }
            pq.add(temp - 1);
        }
        long ans = 0;
        while (!pq.isEmpty()) {
            int temp = pq.poll();
            ans += ((long) temp * temp);
        }
        return ans;
    }
}
