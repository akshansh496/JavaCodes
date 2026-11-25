package Leetcode;

public class Shortest_Path_In_Binary_Matrix {

    static int dir[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, 1}, {1, 1}, {-1, -1}, {1, -1}};

    public static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1 || grid[grid.length - 1][grid.length - 1] == 1) {
            return -1;
        }
        boolean vis[][] = new boolean[grid.length][grid.length];
        int res = helper(grid, 0, 0, vis);
        if (res != Integer.MAX_VALUE) {
            return res;
        }
        return -1;
    }

    public static int helper(int[][] grid, int i, int j, boolean vis[][]) {
        if (i == grid.length - 1 && j == grid.length - 1) {
            return 1;
        }
        vis[i][j] = true;
        int ans = Integer.MAX_VALUE;
        for (int idx = 0; idx < 8; idx++) {
            int newX = i + dir[idx][0];
            int newY = j + dir[idx][1];
            if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid.length && grid[newX][newY] == 0 && !vis[newX][newY]) {
                int res = helper(grid, newX, newY, vis);
                if (res != Integer.MAX_VALUE) {
                    ans = Math.min(ans, 1 + res);
                }
            }
        }
        vis[i][j] = false;
        return ans;
    }

    public static void main(String[] args) {
        int grid[][] = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(shortestPathBinaryMatrix(grid));
    }
}
