package Recursion;

public class Check_Sorted_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,5};
        System.out.println(check(arr,arr.length-1,0));
    }
    static boolean check(int arr[],int l,int idx){
        if(idx==l)
        return true;
        else if(arr[idx]<=arr[idx+1]){
            return check(arr, l, idx+1);
        }
        return false;
    }
}
