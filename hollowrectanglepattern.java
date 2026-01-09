import java.util.*;
public class hollowrectanglepattern {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no. of rows");
      int row=sc.nextInt();
      System.out.println("Enter no. of column");
      int column=sc.nextInt();
      for(int i=0;i<row;i++)//0 1 
      {
        for(int j=0;j<column;j++)//0
        {
            if(i==0||j==0||i==(row-1)||j==(column-1))//true
            System.out.print("*\t");//**** 
            else
            System.out.print("\t");
        }
        System.out.println();
      }
    }
}
