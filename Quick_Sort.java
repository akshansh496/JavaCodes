import java.util.*;
public class Quick_Sort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,10,9,6,8,7,12,11,15};
        quick(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int arr[],int low,int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e=hi;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quick(arr,low,e);           
        quick(arr,s,hi);
    }
}
