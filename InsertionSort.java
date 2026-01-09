import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter size of array");
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        // System.out.println("Enter elements in the array");
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=1;i<size;i++){
        //     int j=i;
        //     while(j>0 && arr[j]<arr[j-1]){
        //         int temp=arr[j];
        //         arr[j]=arr[j-1];
        //         arr[j-1]=temp;
        //         j--;
        //     }
        // }
        int arr[]={5,3,4,1,2};
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && curr<arr[prev] ){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
