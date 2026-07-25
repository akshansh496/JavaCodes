package Leetcode;

public class Maximum_Product_of_Two_Digits {
    public static int maxProduct(int n) {
        int first=0;
        int second=0;
        while(n!=0){
            int rem=n%10;
            if(rem>first){
                second=first;
                first=rem;
            }   
            else if(rem>second) second=rem;
            n/=10;
        }
        return (first*second);
    }
    public static void main(String[] args) {
        System.out.println(maxProduct(123456));
    }
}
