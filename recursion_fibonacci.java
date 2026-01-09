import java.util.Scanner;

public class recursion_fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    public static int fib(int n){
        if(n==1){
        return 1;
        }
        else if(n==0){
        return 0;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
