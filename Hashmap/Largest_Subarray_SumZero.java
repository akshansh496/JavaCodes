package Hashmap;

import java.util.HashMap;

public class Largest_Subarray_SumZero {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        int sum=0;
        int length=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if (sum == 0) {
                length = j + 1;
            }
            if(!map.containsKey(sum))
            map.put(sum,j);
            else
            length=Math.max(length,j-map.get(sum));
        }
        System.out.println(length);
    }
}
