package Leetcode;

public class Longest_bitonic_Subsequence {
    public static void main(String[] args) {
        
    }
    public static int longestBitonicSubsequence(int arr[]){
        int n=arr.length;
        // leftLIS[i] = length of the Longest Increasing Subsequence
        int leftLIS[]=new int[n];
        for(int i=0;i<n;i++)    leftLIS[i]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && leftLIS[j]+1>leftLIS[i])
                    leftLIS[i]=leftLIS[j]+1;
            }
        }
        // rightLIS[i] = length of the Longest Decreasing Subsequence
        int rightLIS[]=new int[n];
        for(int i=0;i<n;i++)    rightLIS[i]=1;
        for(int i=n-2;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if(arr[i]>arr[j] && rightLIS[j]+1>rightLIS[i])
                    rightLIS[i]=rightLIS[j]+1;
            }
        }
        int max=1;
        // leftLIS[i] = increasing part including peak
        // rightLIS[i] = decreasing part including peak
        //
        // Peak is counted twice, so subtract 1
        for(int i=0;i<n;i++)    max=Math.max(max,leftLIS[i]+rightLIS[i]-1);
        return max;
    }
}
