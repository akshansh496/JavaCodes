import java.util.*;
public class pattern5 {
    public static void main ()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no. of rows");
     int row=sc.nextInt();
     System.out.println("Enter no. of columns");
     int column=sc.nextInt();
     int c=1;
     for(int i=0;i<row;i++)
     {
        for(int j=0;j<=i;j++)
        {
System.out.print(c++ +"\t");
        }System.out.println();
     }
     
    }
    
}
