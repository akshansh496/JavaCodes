package Recursion;

public class First_Occuerence {
    public static void main(String[] args) {
        int arr[]={1,2,2,4,5,5,4,3};
        int target=5;
        System.out.println(check(arr,target,0));
    }
    static int check(int arr[],int target,int idx){
        if(idx>arr.length-1)
        return -1;
        if(target==arr[idx])
        return idx;
        return check(arr, target, idx+1);
    }
}
