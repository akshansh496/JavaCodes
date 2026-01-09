package Recursion;

public class Nth_fibonacci {
    static int sum;
    public static void main(String[] args) {
        int n=25;
        System.out.println(findNumber(n));
    }
    static int findNumber(int n){
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
        sum=findNumber(n-1)+findNumber(n-2);
        return sum;
    }
}
