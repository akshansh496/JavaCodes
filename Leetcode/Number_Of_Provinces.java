package Leetcode;

public class Number_Of_Provinces {

    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean vis[] = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(isConnected, vis, i);
                count++;
            }

        }
        return count;
    }

    public static void dfs(int[][] isConnected, boolean[] vis, int idx) {
        vis[idx] = true;
        for (int i = 0; i < isConnected.length; i++) {
            if (i == idx) {
                continue;
            }
            if (!vis[i] && isConnected[idx][i] == 1) {
                dfs(isConnected, vis, i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(findCircleNum(arr));
    }
}
