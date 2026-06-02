package DP;
// Ninja is planing this ‘N’ days-long training schedule. Each day, he can perform any one of these three activities. (Running, Fighting Practice or Learning New Moves). Each activity has some merit points on each day. As Ninja has to improve all his skills, he can’t do the same activity in two consecutive days. Can you help Ninja find out the maximum merit points Ninja can earn?

// You are given a 2D array of size N*3 ‘POINTS’ with the points corresponding to each day and activity. Your task is to calculate the maximum number of merit points that Ninja can earn.
import java.util.*;
public class Ninja_Training {
    public static void main(String[] args) {
        int arr[][]={{1,2,5},
                    {3,1,1},
                    {3,3,3}};
        System.out.println(recursion(arr,0,-1));

        //change ho rha h row aur used to usi ke basis pe arr create hogi
        int dp[][]=new int[arr.length][4];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(memo(arr, 0, -1,dp));
        System.out.println(tab(arr));
    }
    public static int recursion(int arr[][],int row,int used){
        if(row==arr.length) return 0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            if(i==used) continue;
            max=Math.max(max,arr[row][i]+recursion(arr, row+1,i));
        }
        return max;
    }
    public static int memo(int arr[][],int row,int used,int dp[][]){
        if(row==arr.length) return 0;

        int col = used + 1; 

        if(dp[row][col] != -1)
        return dp[row][col];

        int max=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            if(i==used) continue;
            max=Math.max(max,arr[row][i]+memo(arr, row+1,i,dp));
            
        }
        return dp[row][col]=max;
    }
    public static int tab(int arr[][]){
        int n=arr.length;
        int dp[][]=new int[n][3];
        for(int i=0;i<3;i++){
            dp[0][i]=arr[0][i];
        }
        for(int i=1;i<n;i++){
            dp[i][0]=arr[i][0]+Math.max(dp[i-1][1], dp[i-1][2]);
            dp[i][1]=arr[i][1]+Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2]=arr[i][2]+Math.max(dp[i-1][1], dp[i-1][0]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            max=Math.max(max,dp[n-1][i]);
        }
        return max;
    }
    //space optimisation
    public static int space_optimisation(int arr[][]){
        int n=arr.length;
        int prev3=arr[0][0];
        int prev2=arr[0][1];
        int prev1=arr[0][2];
        for(int i=1;i<n;i++){
            int curr3=arr[i][0]+Math.max(prev2, prev1);
            int curr2=arr[i][1]+Math.max(prev1, prev3);
            int curr1=arr[i][2]+Math.max(prev3, prev2);
            prev3=curr3;
            prev2=curr2;
            prev1=curr1;
        }
        return Math.max(prev3,Math.max(prev2,prev1));
    }
}
