// Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired
package Recursion;

public class Friends_Pairing {
    public static void main(String[] args) {
        System.out.println(ways(3));
    }
    static int ways(int n){
        if(n==1 || n==2)
        return n;
        
        int fnm1=ways(n-1);

        int fnm2=ways(n-2);
        int pairways=(n-1)*fnm2;

        return fnm1+pairways;
    }
}
