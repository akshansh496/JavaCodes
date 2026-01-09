import java.util.*;
public class Search2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int r=sc.nextInt();
        System.out.println("Enter columns");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int i,j;
        System.out.println("Enter elements");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number to be searched");
        int x=sc.nextInt();
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(x==a[i][j])
                System.out.println(x+" is found at index "+i+","+j);
            }
        }
    }
}
