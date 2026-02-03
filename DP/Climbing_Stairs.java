package DP;
//count ways to reach nth stair.The person can either climb 1 or 2 stairs at a time
public class Climbing_Stairs {
    //memoization
    public static int waysToclimb(int n,int ways[]){
        if(n==1 || n==0) return 1;
        if(ways[n]==0){
            ways[n]=waysToclimb(n-1, ways)+waysToclimb(n-2, ways);
        }
        return ways[n];
    }
    //tabulation
    public static int waysToclimbTabular(int n){
        int[] ways=new int[n+1];
        ways[0]=1;
        ways[1]=1;
        for(int i=2;i<=n;i++){
            ways[i]=ways[i-1]+ways[i-2];
        }
        return ways[n];
    }
    public static void main(String[] args) {
        int n=5;
        int ways[]=new int[n+1];
        // System.out.println(waysToclimb(n,ways));
        System.out.println(waysToclimbTabular(n));
    }
}
