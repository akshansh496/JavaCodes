package DivideAndConquer;

public class MergeSortString {
    public static void main(String[] args) {
        String arr[]={"sun","earth","mars","mercury"};
        mergesort(arr, 0, arr.length-1);
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]+" ");
        }
    }
    static void mergesort(String arr[],int si,int ei){
        if(si>=ei) return;
        int mid=si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr, si,mid, ei);
    }
    static void merge(String arr[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<=0)
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
        for (int t = 0; t < temp.length; t++) {
            arr[si+t]=temp[t];
        }
    }

}
