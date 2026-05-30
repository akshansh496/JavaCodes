package DP;
// There is a frog on the 1st step of an N-stairs-long staircase. The frog wants to reach the Nth stair.
// HEIGHT[i] represents the height of the (i+1)th stair.
// If the frog jumps from the ith stair to the jth stair, the energy lost in the jump is:
// ∣HEIGHT[i−1]−HEIGHT[j−1]∣
// The frog is currently on the ith stair. It can jump to any of the next K stairs, i.e., from stair i it can jump to stair:
// i+1, i+2, …, i+K
// provided that the destination stair does not exceed N.
// Your task is to find the minimum total energy required for the frog to reach the Nth stair from the 1st stair.
import java.util.*;
public class Frog_jump_With_K_Steps {
    public static void main(String[] args) {
        int n=5;
        int k=3;
        int height[]={10 ,30, 40, 50, 20};
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(memo(n-1,k,height,dp));
        System.out.println(tab(k, height));
    }
    public static int memo(int idx,int k,int height[],int dp[]){
        if(idx==0)  return 0;
        if (dp[idx] != -1)  return dp[idx];
        int minEnergy = Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(idx-i>=0){
                int energy = memo(idx - i, k, height, dp)+ Math.abs(height[idx] - height[idx - i]);
                minEnergy = Math.min(minEnergy, energy);
            }
        }
        return dp[idx] = minEnergy;
    }
    public static int tab(int k,int height[]){
        int n=height.length;
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int idx=1;idx<n;idx++){
            int minEnergy = Integer.MAX_VALUE; 
            for(int i=1;i<=k;i++){
                if(idx-i>=0){
                    int energy = dp[idx-i]+ Math.abs(height[idx] - height[idx - i]);
                    minEnergy = Math.min(minEnergy, energy);
                }
            }
            dp[idx] = minEnergy;
        }
        return dp[n-1];
    }
}
