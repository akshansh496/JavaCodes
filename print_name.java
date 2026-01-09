import java.util.*;
public class print_name {
    public static void a(String n)
    {
        System.out.println(n);
        return;
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        
        a(name);
}
}
