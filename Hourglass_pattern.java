import java.util.*;
public class Hourglass_pattern {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x=5;
        
        for(int i=0;i<x;i++)
        {
            //first half
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<x;j++)
            {
                System.out.print("*");
            }
            //second half
            for(int j=i;j<4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            //third part
            for(int j=i;j<4;j++)
            {
                System.out.print(" ");
            }for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            //fourth part
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
