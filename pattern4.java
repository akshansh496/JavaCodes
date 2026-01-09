import java.util.*;

public class pattern4 {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int row=sc.nextInt();
        System.out.println("Enter no. of columns");
        int column=sc.nextInt(); 
        for(int i=row;i>=1;i--)
        {
            for(int j=1;j<=i;j++){
            System.out.print(j+" ");
            }
        System.out.println(" ");
    }}
    
}
