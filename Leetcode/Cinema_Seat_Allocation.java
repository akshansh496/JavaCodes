package Leetcode;

import java.util.HashSet;

public class Cinema_Seat_Allocation {
    public static void main(String[] args) {
        int n= 3;
        int reservedSeats[][]={{1,2},{1,3},{1,8},{2,6},{3,1},{3,10}};
        System.out.println(maxNumberOfFamilies(n, reservedSeats));
    }
    public static int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> row=new HashSet<>();
        for(int arr[]:reservedSeats){
            set.add(arr[0]*10+arr[1]);
            row.add(arr[0]);
        }
        int ans=0; 
        for(int r:row){
            boolean left=!(set.contains(r*10+2) || set.contains(r*10+3) || set.contains(r*10+4) || set.contains(r*10+5) );
            boolean mid=!(set.contains(r*10+4) || set.contains(r*10+5) || set.contains(r*10+6) || set.contains(r*10+7) );
            boolean right=!(set.contains(r*10+6) || set.contains(r*10+7) || set.contains(r*10+8) || set.contains(r*10+9) );

            if(left && right)   ans+=2;
            else if(left || right || mid)   ans+=1;
        }
        ans+=(n-row.size())*2;
        return ans;
    }
}
