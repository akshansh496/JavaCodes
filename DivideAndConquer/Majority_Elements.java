package DivideAndConquer;

public class Majority_Elements {
    public static void main(String[] args) {
        int arr[]={2,3,4,3,3,2,3};
        int n=arr.length;
        // sort(arr, 0, n-1);
        // System.out.println("Majority Element: "+arr[n/2]);
        System.out.println("Majority Element: "+Majority(arr,0,0,0));
    }
    // static void sort(int arr[],int low,int high){
    //     if(low>=high)
    //     return ;
    //     int mid=low+(high-low)/2;
    //     sort(arr, low, mid);
    //     sort(arr, mid+1, high);
    //     merge(arr, low, mid, high);
    // }
    // static void merge(int arr[],int low,int mid,int high){
    //     int c1=0;
    //     int c2=0;
    //     int temp[]=new int[high-low+1];
    //     int s=low;
    //     int e=mid+1;
    //     int k=0;
    //     while(s<=mid && e<=high){
    //         if(arr[s]<arr[e])
    //         temp[k++]=arr[s++];
    //         else
    //         temp[k++]=arr[e++];
    //     }
    //     while(s<=mid){
    //         temp[k++]=arr[s++];
    //     }
    //     while(e<=high){
    //         temp[k++]=arr[e++];
    //     }
    //     for (int idx = 0; idx < temp.length; idx++) {
    //         arr[low+idx]=temp[idx];
    //     }
    // }




    // Boyer-Moore Voting Algorithm(works when majority element is >n/2)

    // static int Majority(int arr[],int len){
    //     int count=0;
    //     int candidate=0;
    //     for (int num :arr){
    //         if(count==0){
    //             candidate=num;
    //         }
    //         if(num==candidate)
    //         count++;
    //         else
    //         count--;
    //     }
    //     return candidate;
    // }

    static int Majority(int arr[],int count,int candidate,int idx){
        if(idx==arr.length)
        return candidate;
        if(count==0){
            candidate=arr[idx];
        }
        if(arr[idx]==candidate)
            count++;
        else
            count--;
        return Majority(arr, count, candidate, idx+1);
    }
}
