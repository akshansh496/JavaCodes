package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Sum_Of_Gcd_Of_Formed_Pairs {
    public static long gcdSum(int[] nums) {
        ArrayList<Integer> prefixGcd=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=(Math.max(nums[i],max));
            prefixGcd.add(gcd(nums[i],max));
        }
        Collections.sort(prefixGcd);
        int start=0;
        int end=prefixGcd.size()-1;
        long sum=0;
        while(start<end){
            sum+=gcd(prefixGcd.get(start++),prefixGcd.get(end--));
        }
        return sum;
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int nums[]={3,6,2,8};
        System.out.println(gcdSum(nums));
    }
}
