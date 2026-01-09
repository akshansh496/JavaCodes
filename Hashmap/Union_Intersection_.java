package Hashmap;
import java.util.*;
public class Union_Intersection_ {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> map=new HashSet<>();
        for(int i:arr1){
            map.add(i);
        }
        for(int i:arr2){
            map.add(i);
        }
        System.out.println("Union size : "+map.size());
        for(int i:map){
            System.out.print(i+" ");
        }
        System.out.println();
        HashSet<Integer> map1=new HashSet<>();
        for(int i:arr1){
            map1.add(i);
        }
        int count = 0;
        for(int i=0; i<arr2.length; i++) {
            if(map1.contains (arr2[i])) {
            count++;
            map1.remove(arr2[i]);
            System.out.print(arr2[i]+" ");
            }
        }
        System.out.println("Intersection size : "+count);
    }
}
