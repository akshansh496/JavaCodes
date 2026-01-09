package Greedy;

import java.util.*;

public class Indian_Coins {
    public static void main(String[] args) {
        Integer[] coins={1,20,50,2000,100,2,5,10,500};
        Arrays.sort(coins,Collections.reverseOrder());
        int V=121;
        int totalCoinsUsed=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=V){
                ans.add(coins[i]);
                totalCoinsUsed+=V/coins[i];
                V-=(V/coins[i]*coins[i]);
            }
        }
        System.out.println("Total Coins Used: "+totalCoinsUsed);
        System.out.println("Coins Used: "+ans);

    }
}
