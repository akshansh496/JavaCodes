package Flipkart_Grid_Practice;

public class Split_Array_Largest_Sum {
        static int min=Integer.MAX_VALUE;
        public static int splitArray(int[] nums, int k) {
            int prefixSum[]=new int[nums.length];
            prefixSum[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                prefixSum[i]=nums[i]+prefixSum[i-1];
            }
            helper(nums.length-2,k-1,prefixSum,Integer.MIN_VALUE,nums.length-1);
            return min;
        }
        public static void helper(int idx,int k,int[] prefixSum,int max,int end){
            if(k==0){
                max = Math.max(max, prefixSum[end]);
                min = Math.min(min, max);
                return;
            }
            if(idx<0)   return;
            helper(idx-1,k-1,prefixSum,Math.max(max,prefixSum[end]-prefixSum[idx]),idx);
            helper(idx-1,k,prefixSum,max,end);
        }
        public static void main(String[] args) {
            int nums[]={2,3,1,2,4,3};
            int k = 3;
            System.out.println(splitArray(nums, k));
        }
}
