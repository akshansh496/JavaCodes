package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Zero_One_Matrix {

    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int dist[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], -1);
        }
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                    q.offer(new int[]{i, j});
                }
            }
        }
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};
        while (!q.isEmpty()) {
            int cell[] = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextRow = cell[0] + dRow[i];
                int nextCol = cell[1] + dCol[i];
                if (nextRow >= 0 && nextCol >= 0 && nextRow < m && nextCol < n && dist[nextRow][nextCol] == -1) {
                    dist[nextRow][nextCol] = dist[cell[0]][cell[1]] + 1;
                    q.offer(new int[]{nextRow, nextCol});
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int mat[][] = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ans[][] = updateMatrix(mat);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }

    }
}
