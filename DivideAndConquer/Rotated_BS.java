package DivideAndConquer;

public class Rotated_BS {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(sort(arr, 0, arr.length-1, 0));
        System.out.println(sort_iteration(arr, 0,arr.length-1));
    }
    static int sort(int arr[],int s,int e,int target){
        int mid=s+(e-s)/2;
        if(s>e)
        return -1;
        if(arr[mid]==target)
        return mid;
        //mid on line 1
        if(arr[s]<arr[mid]){
            //search on left side
            if(target>=arr[s] && target<arr[mid])
            return sort(arr, s, mid, target);
            //search on right side
            else
            return sort(arr, mid+1, e, target);
        }
        //mid on line 2
        else{
            //search on right side
            if(target<=arr[e] && target>arr[mid])
            return sort(arr, mid+1, e, target);
            //search on left side
            else
            return sort(arr, s, mid, target);
        }

    }
    static int sort_iteration(int arr[],int target,int len){
        for (int i = 0; i <=len; ) {
            int mid=i+(len-i)/2;
            if(arr[mid]==target) return mid;
            if(arr[i]<arr[mid]){
                if(target>=arr[i] && target<arr[mid])
                len=mid;
                else 
                i=mid+1;
            }
            else{
                if(target<=arr[len] && target>arr[mid])
                i=mid+1;
                else 
                len=mid;
            }
        }
        return -1;
    }
}
