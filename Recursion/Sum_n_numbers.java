package Recursion;

public class Sum_n_numbers {
    static int sum;
    public static void main(String[] args) {
        int n=4;
        System.out.println(printSum(n));
    }
    static int printSum(int n){
        if(n==1)
        return 1;
        sum=n+printSum(n-1);
        return sum;
    }
}
