package Recursion;

public class Factorial {
    static int fact;
    public static void main(String[] args) {
        int n=6;
        System.out.println(printfactorial(n));
    }
    static int printfactorial(int n){
        if(n==1){
            return 1;
        }
        fact=n*printfactorial(n-1);
        return fact;
    }
}
