package Leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Sort_The_Jumbled_Numbers {
    static class Info implements Comparable<Info>{
        int num;
        int original;
        int idx;
        public Info(int num,int original,int idx){
            this.num=num;
            this.original=original;
            this.idx=idx;
        }
        public int compareTo(Info o){
            if(this.num==o.num) return this.idx-o.idx;
            return this.num-o.num;
        }

    }
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        PriorityQueue<Info> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            StringBuilder num=new StringBuilder();
            while(n!=0){
                num.append(mapping[n%10]);
                n/=10;
            }
            if(nums[i]==0)  num.append(mapping[0]);
            pq.add(new Info(Integer.parseInt(num.reverse().toString()),nums[i],i));
        }
        int ans[]=new int[nums.length];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll().original;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] mapping = {8,9,4,0,2,1,3,5,7,6};
        int[] nums = {991,338,38};
        int[] ans=sortJumbled(mapping, nums);
        System.out.println(Arrays.toString(ans));
    }
}
