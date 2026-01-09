import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int arr[]={0,4,6,1,1,1,3,2,5};
        count(arr);
    }
    public static void count(int arr[]){
        int max = arr[0];
        int len=arr.length;
        for (int i = 1; i < len; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int temp[]=new int[max+1];
        for (int i = 0; i < len; i++) {
            temp[arr[i]]++;
        }
        System.out.println(Arrays.toString(temp)); 
        int i=0;
        for (int idx = 0; idx < temp.length; idx++) {
            if(temp[idx]!=0){
                arr[i++]=idx;
                temp[idx]--;
                idx--;
            }
        }
        System.out.println(Arrays.toString(arr)); 
    }
}
