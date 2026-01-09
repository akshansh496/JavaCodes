public class BinarySearh {
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int target=12;
        int ans=sort(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    public static int sort(int a[],int t,int start,int end){
        if(start>end)
            return -1;
        int mid=(start+end)/2;
        if(a[mid]==t)
        return mid;
        else if(a[mid]<t)
          return sort(a,t,mid+1,end);
        else
           return  sort(a,t,start,mid-1);
        }
        // while(start<=end){
        //     int mid=(start+end)/2;
        //     if(a[mid]==t)
        //     return mid;
        //     else if(a[mid]<t)
        //         start=mid+1;
        //     else 
        //         end=mid-1;
        // }
        // return -1;
}

