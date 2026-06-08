package Leetcode;
import java.util.*;
public class Find_Indices_With_Index_And_Value_Difference {
        public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+indexDifference;j<nums.length;j++){
                    if(Math.abs(nums[i]-nums[j])>=valueDifference){
                        return new int[]{i, j};
                    }
                }
            }
            return  new int[]{-1, -1};
        }
        public static void main(String[] args) {
            int nums[]={5,1,4,1};
            System.out.println(Arrays.toString(findIndices(nums, 2, 4)));
        }
}
