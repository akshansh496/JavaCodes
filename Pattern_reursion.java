import java.util.*;
public class Pattern_reursion {
    public static void main(String[] args) {
        // triangle1(4,4);

        // triangle2(0,0,4);

        // int arr[]={7,8,3,1,2};
        // BubbleSort(arr,arr.length-1, 0, 0);
        // System.out.println(Arrays.toString(arr));

        int arr[]={7,8,3,1,2};
        SelectionSort(arr,arr.length,0,0,0);
        System.out.println(Arrays.toString(arr));
    }





    public static void triangle1(int r,int c){
        if(r==0)
        return;
        if(c==0){
            System.out.println();
            triangle1(r-1,r-1);
        }
        else{
            System.out.print("*");
            triangle1(r,c-1);
        }
    }






    public static void triangle2(int r,int c,int R){
        // for(int i=0;i<4;i++){
        //     for (int j = 0; j <=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        if(r>R)
        return;
        if (c==r){
            System.out.println();
            triangle2(r+1, 0, R);
        }
        else{
            System.out.print("*");
            triangle2(r, c+1, R);
        }
    }






    public static void BubbleSort(int arr[],int l,int i,int j){
        // int arr[]={7,8,3,1,2};
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j+1]<arr[j]){
        //             int temp=arr[j+1];
        //             arr[j+1]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        // In Java, when you pass an array to a method, you're not passing a copy of the array, but rather a reference to the original array. So, any changes made to the array elements inside the method directly modify the original array.
        if(i==l)
        return;
        if(j==l-i)
        BubbleSort(arr, l, i+1, 0);
        else{
            if(arr[j+1]<arr[j]){
                int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
            }
            BubbleSort(arr, l, i, j+1);  
        }
    }








    public static void SelectionSort(int [] arr,int l,int i,int j,int smallest){
        // int arr[]={7,8,3,1,2};
        // for(int i=0;i<arr.length-1;i++){
        //     int smallest=i;
        //     for(int j=i;j<arr.length;j++){
        //         if(arr[j]<arr[smallest])
        //         smallest=j;
        //     }
        //     int temp=arr[smallest];
        //     arr[smallest]=arr[i];
        //     arr[i]=temp;
        // }
        // System.out.println(Arrays.toString(arr));
        if(i==l){
        return;
        }
        if(j==l){
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            SelectionSort(arr, l, i+1, i+1, i+1);
        }
        else{
            if(arr[j]<arr[smallest])
            SelectionSort(arr, l, i, j+1, j);
            else
            SelectionSort(arr, l, i, j+1, smallest);
        }
    }
}
