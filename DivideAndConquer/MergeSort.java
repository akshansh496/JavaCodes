package DivideAndConquer;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={4,3,5,3,2,4,2,4,35,54,-2};
        mergesort(arr, 0, arr.length-1);
        print(arr);
    }
    static void mergesort(int arr[],int si,int ei){
        if(si >= ei) return; 
        int mid=si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j])
                temp[k++]=arr[i++];
            else
                temp[k++]=arr[j++];
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(int t=0;t<temp.length;t++){
            arr[si+t]=temp[t];
        }
    }
    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}



