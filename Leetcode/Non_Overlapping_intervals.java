package Leetcode;

import java.util.Arrays;

public class Non_Overlapping_intervals {

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            return Integer.compare(a[1], b[1]);
        });
        int previousEnd = intervals[0][1];
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < previousEnd) {
                count++; 
            }else {
                previousEnd = intervals[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int intervals[][] = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
