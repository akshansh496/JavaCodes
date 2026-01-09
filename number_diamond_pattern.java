import java.util.*;
public class number_diamond_pattern {
    public static void main()
        {
            Scanner sc= new Scanner(System.in);
            for(int i=1;i<=5;i++)
            {
                //first half
                for(int j=i;j<5;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                //second half
                for(int j=i-1;j>=1;j--){
                    System.out.print(j);
                }
                System.out.println();
            }
            for(int i=4;i>0;i--){
                //third part
                for(int j=5;j>i;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                //fourth part
                for(int j=i-1;j>0;j--){
                    System.out.print(j);
                }
                System.out.println();
        }
    
}
}