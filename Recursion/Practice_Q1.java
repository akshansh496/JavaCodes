package Recursion;

public class Practice_Q1 {
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        occurence(arr,2,0);
    }
    static void occurence(int arr[],int target,int idx){
        if(idx==arr.length)
        return;
        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        occurence(arr, target, idx+1);
    }
}
