package Recursion;

public class Last_Occurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,2};
        int target=2;
        System.out.println(check(arr,target,arr.length-1));
    }
    static int check(int arr[],int target,int idx){
        if(idx<0)
        return -1;
        if(arr[idx]==target)
        return idx;
        return check(arr, target, idx-1);
    }
}
