package BackTracking;

public class GridWays {
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(ways(0, 0, n, m));


        // direct permutation formula
        // (n-1+m-1)!/(n-1)!/(m-1)!
    }
    public static int ways(int i,int j,int n,int m){
        if(i==n-1 && j==m-1)
            return 1;
        else if(i==n || j==m)
        return 0;
        int w1 =ways(i+1, j, n, m);
        int w2 = ways(i, j+1, n, m);
        return w1+w2;
    }
}
