package Leetcode;

public class Check_Divisibilty_By_Digit_Sum_And_Product {
    public static void main(String[] args) {
        System.out.println(checkDivisibility(99));
    }
    public static boolean checkDivisibility(int n) {
        int num=n;
        int sum=0;
        int prod=1;
        while(n!=0){
            int r=n%10;
            sum+=r;
            prod*=r;
            n/=10;
        }
        return (num%(sum+prod)==0);
    }
}
