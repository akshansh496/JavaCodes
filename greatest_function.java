import java.util.*;
public class greatest_function {
    public static int greatest(int a,int b){
        if(a>b)
        return a;
        else 
        return b;
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(greatest(x,y)+" is greater");
    }
}
