
import java.util.*;
public class diamond {
public static void main()
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        //second quadrant
        for(int j=1;j<n-i;j++)
        {
            System.out.print(" ");
        }for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
                //first quadrant 
        for(int j=0;j<i;j++)
        {
            System.out.print("*");
        }
        for(int j=n-i;j>0;j--)
        {
            System.out.print(" ");
        }System.out.println();
    }
    for(int i=0;i<n;i++)
    {
        //third quadrant
        for(int j=0;j<i;j++)
        {
            System.out.print(" ");
        }
        for(int j=i;j<n;j++){
            System.out.print("*");
        }
        for(int j=n-i;j>1;j--){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
