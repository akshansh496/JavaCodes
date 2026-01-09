package Recursion;

public class X_to_power_n {
    public static void main(String[] args) {
        System.out.println(power(2,10));
        System.out.println(power_optimised(2,5));
        System.out.println(myPow(2.0,-2147483647));
    }
    static int power(int x,int n){
        if(n==0)
        return 1;
        return x*power(x, n-1);
    }
    static int power_optimised(int x,int n){
        if(n==0)
        return 1;
        int halfpower=power(x, n/2);
        if(n%2==0)
        return halfpower*halfpower;
        return x*halfpower*halfpower;
    }
    static double myPow(double x, int n) {
        int pow=n;
        double ans=1;
        while(n!=0){
            ans=ans*x;
            if(n<0){
                n=Math.abs(n)-1;
                continue;
            }
            n=n-1;
        }
        if(pow<0)
        return 1/ans;
        else
        return ans;
    }
}
