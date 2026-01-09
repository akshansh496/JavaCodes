import java.util.Scanner;

public class rhombuspattern {
    public static void main ()
    {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter no. of rows");
     int row=sc.nextInt();
     System.out.println("Enter no. of columns");
     int column=sc.nextInt();
     for(int i=0;i<row;i++)
     {
        for(int j=0;j<column;j++)
        {
         if((i+j)>=(row/2)&&(i+j)<=(row-1))
         System.out.print("*\t");
         else
         System.out.print("\t");
        }System.out.println();
     }
}
}
