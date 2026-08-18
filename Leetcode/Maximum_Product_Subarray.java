package Leetcode;

public class Maximum_Product_Subarray {
    public static int maxProduct(int[] nums) {
        if(nums.length==1)  return nums[0];
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int prev=nums[i];
            ans=Math.max(ans,prev);
            for(int j=i+1;j<n;j++){
                int curr=nums[j]*prev;
                ans=Math.max(ans,curr);
                prev=curr;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
