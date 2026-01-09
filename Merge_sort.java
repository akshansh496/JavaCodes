
import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,10,9,6,8,7,12,11,15};
        // System.out.println(Arrays.toString(sort(arr)));
        sort_in_place(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    // public static int[] sort(int arr[]){
    //     if(arr.length==1)
    //     return arr;

    //     int mid=arr.length/2;
    //     int left[]=sort(Arrays.copyOfRange(arr, 0, mid));
    //     int right[]=sort(Arrays.copyOfRange(arr, mid, arr.length));

    //     return merge(left,right);
    // }
    // public static int[] merge(int first[],int second[]){
    //     int ans[]=new int[first.length+second.length];
    //     int i=0;
    //     int j=0;
    //     int k=0;
    //     while(i<first.length && j<second.length){
    //         if(first[i]<second[j]){
    //         ans[k]=first[i];
    //         i++;
    //         }
    //         else{
    //         ans[k]=second[j];
    //         j++;
    //         }
    //         k++;
    //     }
    //     while(i<first.length){
    //         ans[k++]=first[i++];
    //     }
    //     while(j<second.length){
    //         ans[k++]=second[j++];
    //     }
    //     return ans;
    // }


//In place merge sort
public static void sort_in_place(int arr[],int s,int e){
    if(e - s <= 1)
    return;
    int mid=s+(e-s)/2;
    sort_in_place(arr, s,mid);
    sort_in_place(arr, mid,e);

    merge_in_place(arr,s,mid,e);
}
public static void merge_in_place(int arr[],int s,int m,int e){
    int ans[]=new int[e-s];
    int i=s;
    int j=m;
    int k=0;
    while(i<m && j<e){
        if(arr[i]<arr[j]){
        ans[k]=arr[i];
        i++;
        }
        else{
        ans[k]=arr[j];
        j++;
        }
        k++;
    }
    while(i<m){
        ans[k++]=arr[i++];
    }
    while(j<e){
        ans[k++]=arr[j++];
    }
    for(int l=0;l<ans.length;l++){
        arr[s+l]=ans[l];
    }
}
}