package Leetcode;

public class House_Robber_2 {
    public static int rob(int[] nums) {
        int n=nums.length;
        //Ignoring the last element
        int prev2=0;
        int prev=nums[0];
        for(int i=2;i<n;i++){
            int curr=Math.max(nums[i-1]+prev2,prev);
            prev2=prev;
            prev=curr;
        }
        int withoutLastElement=prev;
        // Ignoring first element
        prev2=0;
        prev=0;
        for(int i=2;i<=n;i++){
            int curr=Math.max(nums[i-1]+prev2,prev);
            prev2=prev;
            prev=curr;
        }
        int withoutFirstElement=prev;
        return Math.max(withoutLastElement,withoutFirstElement);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(rob(nums));
    }
}
