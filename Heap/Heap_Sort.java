package Heap;

import java.util.*;

public class Heap_Sort {
    static int arr[]={1,2,4,5,3};
    public static void main(String[] args) {
        int n=arr.length;

        // make it a max heap by heapifing non leaf nodes
        for(int i=n/2;i>=0;i--){
            heapify(i,n);
        }

        for(int i=n-1;i>=0;i--){
            // swap first and last
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            // heapify the remaining arr
            heapify(0, i);
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void heapify(int i,int size){ //O(log n)
        // take out left node and right node check which is the smallest among root,left and right.If left or
        //  right is smaller swap it wirth root and do it recursively to check lower levels

        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;

        if(left<size && arr[maxIdx]<arr[left]){
            maxIdx=left;
        }
        if(right<size && arr[maxIdx]<arr[right]){
            maxIdx=right;
        }

        if(maxIdx!=i){
            // swap
            int temp=arr[i];
            arr[i]= arr[maxIdx];
            arr[maxIdx]=temp;

            heapify(maxIdx,size);
        }
    }
}
