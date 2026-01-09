import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int l=sc.nextInt();
        int arr[]=new int[l];
        int i;
        System.out.println("Enter elements of array");
        for(i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        int start=0;
        int end=l-1;
        while(start<end){
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        for(i=-0;i<l;i++){
            System.out.print(arr[i]);
        }
    }

}

