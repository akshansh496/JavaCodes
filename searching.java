import java.util.*;
public class searching {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter elements in array");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        int x=sc.nextInt();
        Boolean flag=false;
        for(int i=0;i<size;i++){
            if (x==a[i]){
                System.out.println(x+" occurs at index "+i);
                flag=true;
                break;
            }
        }
        if (flag==false){
            System.out.println(x+" wasn't found in the array");
        }
    }
}