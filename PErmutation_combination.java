import java.util.*;
public class PErmutation_combination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        System.out.println("Enter value of r");
        int r=sc.nextInt();
        if(n<r || n<0 ||r<0){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Combination:"+factorial(n)/(factorial(r)*factorial(n-r)));
            System.out.println("Permutation:"+factorial(n)/factorial(n-r));

        }
    }
    public static int factorial(int x){
        int fact=1;
        int i;
        for(i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }
}
