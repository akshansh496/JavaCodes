package Leetcode;

import java.util.Arrays;

public class Destroying_Asteroids {
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass;
        for(int i=0;i<asteroids.length;i++){
            if(currMass<asteroids[i])   return false;
            currMass+=asteroids[i];
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(asteroidsDestroyed(10, new int[]{3,9,19,5,21}));
        System.out.println(asteroidsDestroyed(5, new int[]{4,9,23,4}));
    }
}
