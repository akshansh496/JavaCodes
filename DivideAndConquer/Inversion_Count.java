package DivideAndConquer;

public class Inversion_Count {
    public static void main(String[] args) {
        int arr[]={6,3,5,2,7};
        System.out.println(count(arr));
        System.out.println(mergesort(arr, 0, arr.length-1));
    }
    static int count(int arr[]){
        int c=0;
        for (int i = 0;i< arr.length; i++) {
            for (int idx = i+1; idx < arr.length; idx++) {
                if(arr[idx]<arr[i])
                c++;
            }
        }
        return c;
    }
    static int mergesort(int arr[],int si,int ei){
        if(si < ei){ 
        int mid=si+(ei-si)/2;
        int LeftInvCount=mergesort(arr, si, mid);
        int RightInvCount=mergesort(arr, mid+1, ei);
        int invCount=merge(arr,si,mid,ei);
        return LeftInvCount+RightInvCount+invCount;
        }
        return 0;
    }
    static int merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp arr
        int invCount=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j])
                temp[k++]=arr[i++];
            else{
                temp[k++]=arr[j++];
                invCount=mid-i+1;
            }
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
        return invCount;
    }
}
