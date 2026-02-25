package DP;

import java.util.*;

/*
create a sorted and unique copy of original array 
then find longest commmon subsequence b/w them i.e. also the longest increasing subsequence
 */
public class Longest_Incresing_Subsequence {
    public static void main(String[] args) {
        int arr[]={50,50,3,10,7,40,80};
        System.out.println(lis(arr));
    }
    public static int lis(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(Integer i:arr){
            set.add(i);
        }
        int copy[]=new int[set.size()];
        int idx=0;
        for(Integer i: set){
            copy[idx++]=i;
        }
        Arrays.sort(copy);
        return lcs(arr, copy);
    }
    public static int lcs(int arr[],int copy[]){
        int n=arr.length;
        int m=copy.length;
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr[i-1]==copy[j-1])
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}
