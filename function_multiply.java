import java.util.*;
public class function_multiply {
    public static int prod(int a,int b){
        return a*b;
    }    
    public static void main(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enetr two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(prod(x,y));
    }
}
