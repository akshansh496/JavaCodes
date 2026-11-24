package Leetcode;

public class Number_Of_Enclaves {

    public static int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ones = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    ones++;
                }
            }
        }
        int enclaves = 0;
        boolean vis[][] = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int islandSize = helper(grid, i, j, vis);
                if (islandSize != -1) {
                    enclaves += islandSize;
                }
            }
        }
        return enclaves;
    }

    public static int helper(int[][] grid, int i, int j, boolean vis[][]) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return -1;
        }
        if (grid[i][j] == 0 || vis[i][j]) {
            return 0;
        }
        vis[i][j] = true;
        int left = helper(grid, i, j - 1, vis);
        int right = helper(grid, i, j + 1, vis);
        int up = helper(grid, i + 1, j, vis);
        int down = helper(grid, i - 1, j, vis);
        if (left == -1 || right == -1 || down == -1 || up == -1) {
            return -1;
        }
        return 1 + left + right + down + up;
    }

    public static void main(String[] args) {
        int grid[][] = {{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        System.out.println(numEnclaves(grid));
    }
}
