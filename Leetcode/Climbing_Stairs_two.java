package Leetcode;

public class Climbing_Stairs_two {
    public static void main(String[] args) {
        System.out.println(climbStairs(4,new int[]{1,2,3,4}));
    }
    public static int climbStairs(int n, int[] costs) {
        int prev=0;
        int prev2=Integer.MIN_VALUE;
        int prev3=Integer.MIN_VALUE;
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            if(i-1>=0)  first=prev+costs[i-1]+1;
            else    first=Integer.MAX_VALUE;
            if(i-2>=0)  second=prev2+costs[i-1]+4;
            else    second=Integer.MAX_VALUE;
            if(i-3>=0)  third=prev3+costs[i-1]+9;
            else    third=Integer.MAX_VALUE;
            int curr=Math.min(first,Math.min(second,third));
            prev3=prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;

    }
}
