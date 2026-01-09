package BackTracking;

public class First {
    public static void main(String[] args) {
        int arr[]=new int[5];
        xyz(arr,0,1);
        print(arr);
    }
    public static void print(int arr[]){
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
    public static void xyz(int arr[],int idx,int val){
        //base case
        if(idx==arr.length){
        print(arr);
        return;
        }
        //recursion
        arr[idx]=val;
        xyz(arr, idx+1, val+1);
        //backtracking
        arr[idx]=arr[idx]-2;
    }
}
