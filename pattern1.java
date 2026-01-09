import java.util.*;
public class pattern1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int row=sc.nextInt();
        System.out.println("Enter no. of columns");
        int columns=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++)
            {
             System.out.print("*");
            }
            System.out.println("");

        }
    }
}
