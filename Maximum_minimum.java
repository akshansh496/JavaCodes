import java.util.*;
public class Maximum_minimum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Maximum:"+largest(a,b,c));
        System.out.println("Minimum:"+smallest(a,b,c));
    }
    public static int largest(int x,int y,int z){
        if(x>y && x>z)
        return x;
        else if(y>z && y>x)
        return y;
        else
        return z;
    }
    public static int smallest(int x,int y,int z){
        if(x<y && x<z)
        return x;
        else if(y<z && y<x)
        return y;
        else
        return z;
    }
}
