package Flipkart_Grid_Practice;

public class Jump_Game {
        public static boolean canJump(int[] nums) {
            int maxReach=0;
            if(nums[0]!=0)  maxReach=nums[0];
            for(int i=1;i<nums.length;i++){
                if(i>maxReach)  return false;
                maxReach=Math.max(maxReach,i+nums[i]);
            }
            return true;
        }
        public static void main(String[] args) {
            int [] nums={2,3,1,1,4};
            System.out.println(canJump(nums));
        }
}
