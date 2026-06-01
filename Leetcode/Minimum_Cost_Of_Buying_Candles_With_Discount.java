package Leetcode;

import java.util.Arrays;

public class Minimum_Cost_Of_Buying_Candles_With_Discount {
    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int count=0;
        int idx=cost.length-1;
        int totalCost=0;
        while(idx>=0){
            if(count==2){
                idx--;
                count=0;
                continue;
            }
            totalCost+=cost[idx];
            count++;
            idx--;
        }
        return totalCost;
    }
    public static void main(String[] args) {
        System.out.println(minimumCost(new int []{6,5,7,9,2,2}));
    }
}

