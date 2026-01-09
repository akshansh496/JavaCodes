import java.util.*;
public class power_of_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a number");
        int x=sc.nextInt();
        System.out.println("Enter power");
        int y=sc.nextInt();
        System.out.println(power(x,y));
    }
    public static double power(double a,double b){
        return Math.pow(a, b);
    }
}
