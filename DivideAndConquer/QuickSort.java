package DivideAndConquer;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={4,5,43,2,1,2,13,1};
        sort(arr, 0, arr.length-1);
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]+" ");
            
        }
    }
    static void sort(int arr[],int low,int high){
        int s=low;
        int e=high;
        if(low>=high) return;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){// ✅ if arr[s] is already < pivot
                s++;// just move forward, leave it in place
            }
            while(arr[e]>pivot){// ✅ if arr[e] is already > pivot
                e--;// just move backward, leave it in place
            }
            if(s<=e){
                //swap
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                // move both pointers inward to check further
                s++;
                e--;   
            }
        }
        sort(arr, low, e);//to sort left side of pivot
        sort(arr, s, high);//to sort right side of pivot

    }
}
