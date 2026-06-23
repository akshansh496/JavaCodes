package Leetcode;
import java.util.*;
//Not correct
public class Zig_Zag_Arrays {
    // public static int recursion(int l, int r,int idx,int prev1,int prev2) {
    //     if(idx==-1)    return  1;
    //     int sum=0;
    //     for(int i=l;i<=r;i++){
    //         if(prev1==i) continue;
    //         if(i>prev1 && prev1>prev2)  continue;
    //         if(i<prev1 && prev1<prev2)  continue; 
    //         sum+=recursion(l,r,idx-1,i,prev1);
    //     }
    //     return sum;
    // }
    public static int memo(int l, int r,int idx,int prev1,int dir,int dp[][][]) {
        if(idx==-1)    return  1;
        if(dp[idx][prev1][dir]!=-1) return dp[idx][prev1][dir];
        int sum=0;
        for(int i=l;i<=r;i++){
            if(prev1==i) continue;
            if(i>prev1 && dir==1)  continue;
            if(i<prev1 && dir==0)  continue; 
            if(i>prev1)  sum+=memo(l,r,idx-1,i,1,dp);
            else    sum+=memo(l,r,idx-1,i,0,dp);
        }
        return dp[idx][prev1][dir]=sum;
    }
    public static void main(String[] args) {
        int n = 3, l = 1, r = 3;
    
        // int ans = 0;
        // for(int last = l; last <= r; last++) {
        //     for(int secondLast = l; secondLast <= r; secondLast++) {

        //         if(last == secondLast) continue;

        //         ans += recursion(l, r, n-3, secondLast, last);
        //     }
        // }
        // System.out.println(ans);

        int dp[][][]=new int[n][r+1][2];
        for(int i=0;i<n;i++){
            for(int last = 0; last <= r; last++) {
                Arrays.fill(dp[i][last], -1);
            }
        }
        int ans = 0;
        for(int last = l; last <= r; last++) {
            for(int secondLast = l; secondLast <= r; secondLast++) {

                if(last == secondLast) continue;

                int dir = (last > secondLast) ? 1 : 0;
                ans += memo(l, r, n-3, secondLast, dir, dp);
            }
        }
        System.out.println(ans);
    }
}
