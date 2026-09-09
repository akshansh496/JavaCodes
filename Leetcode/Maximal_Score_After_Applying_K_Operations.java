package Leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class Maximal_Score_After_Applying_K_Operations {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int[] nums = {672579538,806947365,854095676,815137524};
        int k = 5;
        System.out.println(obj.maxKelements(nums,k));
    }
}
class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        long score = 0;
        while(k-->0){
            int temp=pq.poll();
            score+=temp;
            pq.add((temp+3-1)/3);
        }
        return score;
    }
}
