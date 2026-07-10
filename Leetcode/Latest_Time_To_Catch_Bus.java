package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Latest_Time_To_Catch_Bus {
    public static int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        int len=buses.length;
        Arrays.sort(buses);
        Arrays.sort(passengers);
        ArrayList<Integer>[] arr = new ArrayList[len];
        for (int i = 0; i < len; i++) {
            arr[i] = new ArrayList<>();
        }
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < passengers.length; i++) {
            set.add(passengers[i]);
        }
        int p = 0;
        for (int i=0;i<len;i++) {
            int cnt = 0;
            while (p < passengers.length && passengers[p] <= buses[i] && cnt < capacity) {
                arr[i].add(passengers[p]);
                p++;
                cnt++;
            }
        }
        if(arr[len-1].size()!=capacity) {
            int temp=buses[len-1];
            while(set.contains(temp)){
                temp--;
            }
            return temp;
        }
        else{
            int temp=arr[len-1].get(arr[len-1].size()-1);
            while(set.contains(temp)){
                temp--;
            }
            return temp;
        }
    }
    public static void main(String[] args) {
        int buses[]={20,30,10};
        int passengers[]={19,13,26,4,25,11,21};
        int capacity=2;
        System.out.println(latestTimeCatchTheBus(buses, passengers, capacity));
    }
}
