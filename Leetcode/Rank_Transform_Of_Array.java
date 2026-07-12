package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Rank_Transform_Of_Array {
    public static int[] arrayRankTransform(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>(arr.length);
        int rank=1;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],rank++);
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(copy[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={37,12,28,9,100,56,80,5,12};
        int ans[]=arrayRankTransform(arr);
        System.out.println(Arrays.toString(ans));
    }
}
