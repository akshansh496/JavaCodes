package Recursion;

public class One_to_n {
    public static void main(String[] args) {
        int n=50;
        printNumber(n);
    }
    static void printNumber(int n){
        if(n<1)
        return;
        printNumber(n-1);
        System.out.println(n);
    }
}
