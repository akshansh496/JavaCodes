import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        System.out.println("Enter number of columns");
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        //initialisation
        int i;int j;
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the indices whose value you want to swap");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the indices whose value you want to swap");
        int c=sc.nextInt();
        int d=sc.nextInt();
        int temp=0;
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                if (i==a && j==b){
                    temp=arr[i][j];
                    arr[i][j]=arr[c][d];
                    arr[c][d]=temp;
                }
            }

        }
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
