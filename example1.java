public class example1 {
        
        public static int[] twoSum(int[] nums, int target) {
            int i,a,b,j,temp;
            int ans[]=new int[2];
            int n=nums.length;
            for(i=0;i<n;i++){
                temp=nums[i];
                for(j=i+1;j<n;j++){
                    if(temp+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                     }
                }
            }
            return ans;
        }public static void main(String[] args) {
            int[] ex = {2, 4, 11, 3};
            int[] result = twoSum(ex, 6);
            if (result != null) {
                System.out.println("Indices: " + result[0] + ", " + result[1]);
            } else {
                System.out.println("No two sum solution found.");
            }
        }
    }
