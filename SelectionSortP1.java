import java.util.*;
public class SelectionSortP1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements in the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int last=size-i-1;
            int l=largest(arr,last);
            int temp=arr[last];
            arr[last]=arr[l];
            arr[l]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int largest(int arr[],int last){
        int large=arr[0];
        int index=0;
        for(int i=1;i<=last;i++){
            if(arr[i]>large){
            large=arr[i];
            index=i;
            }
        }
        return index;
    }
}
