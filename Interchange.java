import java.util.*;
public class Interchange {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int a=30;
        int b=35;
        System.out.println("Initial value of a:"+a+"\tInitial value of b:"+b);
        a=a+b;//65
        b=a-b;//65-35=30
        a=a-b;//65-30
        System.out.println("Final value of a:"+a+"\tFinal value of b:"+b);
}
}