import java.util.*;
public class tableofnumber {
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
        int prod=n*i;
        System.out.println(prod);
    }
 }    
}
