package Leetcode;

import java.util.Arrays;

public class Remove_Covered_Intervals {
    public static int removeCoveredIntervals(int[][] intervals) {
    Arrays.sort(intervals,(a,b)->{
        if(a[0]==b[0])  return Integer.compare(b[1],a[1]);
        return Integer.compare(a[0],b[0]);
    });
    int count=0;
    int max=intervals[0][1];
    for(int i=1;i<intervals.length;i++){
        if(intervals[i][1]<=max)    count++;
        else max=intervals[i][1];
    }
    return intervals.length-count;
    }
    public static void main(String[] args) {
        int intervals[][]={{3,10},{4,10},{5,11}};
        System.out.println(removeCoveredIntervals(intervals));
    }
}
