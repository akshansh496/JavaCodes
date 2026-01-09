import java.util.*;
import java.util.Scanner;
public class Array_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int l=sc.nextInt();
        int arr[]=new int[l];
        int i;
        for(i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(i=0;i<l;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum="+max);
    }
}
