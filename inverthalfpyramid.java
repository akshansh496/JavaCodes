import java.util.*;
public class inverthalfpyramid{
    public static void main(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no. of rows");
     int row=sc.nextInt();
     System.out.println("Enter no. of columns");
     int column=sc.nextInt();
     for(int i=0;i<row;i++)
     {
        for(int j=column;j>i;j--)
        {
            System.out.print("*");
        }
        System.out.println(""); 
}
}
}
