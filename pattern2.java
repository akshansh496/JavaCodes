import java.util.*;
class pattern2
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        System.out.println("Enter number of columns");
        int column=sc.nextInt();
        for(int i=0;i<row;i++)
        {
         for(int j=0;j<column;j++){
            if((i+j)>=(row-1))
            System.out.print("*");
            else
            System.out.print(" ");
         }System.out.println();
        }

        
    }
}