import java.util.*;
public class pattern6 {
    public static void main ()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no. of rows");
     int row=sc.nextInt();
     System.out.println("Enter no. of columns");
     int column=sc.nextInt();
     for(int i=0;i<row;i++)
     {
        for(int j=0;j<=i;j++)
        {
            if((i+j)%2==0)
            System.out.print("1");
            else
            System.out.print("0");
        }System.out.println();
     }    
    }
}
