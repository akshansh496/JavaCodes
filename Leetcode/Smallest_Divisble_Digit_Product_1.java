package Leetcode;

public class Smallest_Divisble_Digit_Product_1 {
    public static int smallestNumber(int n, int t) {
        for(int i=n;;i++){
            if(helper(i)%t==0)  return i;
        }
    }
    public static int helper(int num){
        int prod=1;
        while(num!=0){
            prod*=num%10;
            num/=10;
        }
        return prod;
    }
    public static void main(String[] args) {
        System.out.println(smallestNumber(15, 3));
    }
}
