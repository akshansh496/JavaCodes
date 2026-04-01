package DP;
//same as catalan
public class Count_BST {
    public static void main(String[] args) {
        int n=4;//this is the no. of nodes
        System.out.println(tabulation(n));
    }
    public static int tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;// Empty tree → 1 valid BST
        dp[1]=1;// Single node → Only 1 BST

        // Try making each node as root
        for(int i=2;i<n+1;i++){
            /*
                 If root splits tree into:

                 Left subtree  → j nodes
                 Right subtree → i - j - 1 nodes

                 Total BSTs =
                 (BSTs from left) × (BSTs from right)
            */
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}
