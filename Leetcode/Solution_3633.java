package Leetcode;

import java.util.Scanner;

public class Solution_3633 {
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minTime=Integer.MAX_VALUE;
        int time=0;

        //land first
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int currtime = Math.max(landStartTime[i]+landDuration[i], waterStartTime[j]) + waterDuration[j];
                minTime=Math.min(minTime,currtime);
            }
            time=0;
        }

        //water first
        for(int i=0;i<waterStartTime.length;i++){
            for(int j=0;j<landStartTime.length;j++){
                int currtime = Math.max(waterStartTime[i]+waterDuration[i], landStartTime[j]) + landDuration[j];
                minTime=Math.min(minTime,currtime);
            }
            time=0;
        }
        return minTime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(earliestFinishTime(new int[]{2,8},new int[]{4,1},new int[]{6},new int[]{3}));
    }
}
