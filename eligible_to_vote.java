import java.util.*;
public class eligible_to_vote {
    public static void vote(int age){
        if(age>18)
        System.out.println("eligible to vote");
        else
        System.out.println("not eligible to vote");
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int a=sc.nextInt();
        vote(a);
    }
}
