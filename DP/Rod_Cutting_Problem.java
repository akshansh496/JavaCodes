package DP;
// Given a rod of length ‘N’ units. The rod can be cut into different sizes and each size has a cost associated with it. Determine the maximum cost obtained by cutting the rod and selling its pieces.




// Note:
// 1. The sizes will range from 1 to ‘N’ and will be integers.

// 2. The sum of the pieces cut should be equal to ‘N’.
import java.util.*;
public class Rod_Cutting_Problem {
    public static int recursion(int i,int N,int price[]){
        if(i==0)    return N*price[0];
        if(N==0)    return 0;
        int rodLength = i + 1;
        int notPick=recursion(i-1, N, price);
        int pick=Integer.MIN_VALUE;
        if(rodLength<=N)    pick=price[i]+recursion(i, N-rodLength, price);
        return Math.max(notPick, pick);
    }
    public static int memo(int i,int N,int price[],int dp[][]){
        if(i==0)    return N*price[0];
        if(N==0)    return 0;
        if(dp[i][N]!=-1) return dp[i][N];
        int rodLength = i + 1;
        int notPick=memo(i-1, N, price,dp);
        int pick=Integer.MIN_VALUE;
        if(rodLength<=N)    pick=price[i]+memo(i, N-rodLength, price,dp);
        return dp[i][N]=Math.max(notPick, pick);
    }
    public static int tab(int N,int price[]){
        int dp[][]=new int[N][N+1];
        for(int i=0;i<=N;i++){
            dp[0][i]=i*price[0];
        }
        for(int i=1;i<N;i++){
            for(int j=0;j<=N;j++){
                int rodLength = i + 1;
                int notPick=dp[i-1][j];
                int pick=Integer.MIN_VALUE;
                if(rodLength<=j)    pick=price[i]+dp[i][j-rodLength];
                dp[i][j]=Math.max(notPick, pick);
            }
        }
        return dp[N-1][N];
    }
    public static int space_optimisation(int N,int price[]){
        int prev[]=new int[N+1];
        for(int i=0;i<=N;i++){
            prev[i]=i*price[0];
        }
        for(int i=1;i<N;i++){
            int curr[]=new int[N+1];
            curr[0]=0;
            for(int j=0;j<=N;j++){
                int rodLength = i + 1;
                int notPick=prev[j];
                int pick=Integer.MIN_VALUE;
                if(rodLength<=j)    pick=price[i]+curr[j-rodLength];
                curr[j]=Math.max(notPick, pick);
            }
            prev=curr;
        }
        return prev[N];
    }
    public static int more_space_optimisation(int N,int price[]){
        int prev[]=new int[N+1];
        for(int i=0;i<=N;i++){
            prev[i]=i*price[0];
        }
        for(int i=1;i<N;i++){
            for(int j=0;j<=N;j++){
                int rodLength = i + 1;
                int notPick=prev[j];
                int pick=Integer.MIN_VALUE;
                if(rodLength<=j)    pick=price[i]+prev[j-rodLength];
                prev[j]=Math.max(notPick, pick);
            }
        }
        return prev[N];
    }
    public static void main(String[] args) {
        int N=5;
        int price[]={2,5,7,8,10};
        System.out.println(recursion(N-1, N, price));

        int dp[][]=new int[N][N+1];
        for(int i=0;i<N;i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(memo(N-1, N, price, dp));
        System.out.println(tab(N, price));
        System.out.println(space_optimisation(N, price));
        System.out.println(more_space_optimisation(N, price));
    }
    
}
