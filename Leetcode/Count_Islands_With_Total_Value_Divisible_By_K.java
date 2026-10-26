package Leetcode;

public class Count_Islands_With_Total_Value_Divisible_By_K {

    public static int countIslands(int[][] grid, int k) {
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0 && !vis[i][j]) {
                    long sum = dfs(grid, i, j, vis);
                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static long dfs(int[][] grid, int i, int j, boolean[][] vis) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || vis[i][j] == true) {
            return 0;
        }
        vis[i][j] = true;
        return grid[i][j] + dfs(grid, i + 1, j, vis) + dfs(grid, i, j + 1, vis) + dfs(grid, i - 1, j, vis) + dfs(grid, i, j - 1, vis);
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 2, 1, 0, 0}, {0, 5, 0, 0, 5}, {0, 0, 1, 0, 0}, {0, 1, 4, 7, 0}, {0, 2, 0, 0, 8}};
        int k = 5;
        System.out.println(countIslands(grid, k));
    }
}
