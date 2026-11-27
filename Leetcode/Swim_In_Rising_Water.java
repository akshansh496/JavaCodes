package Leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Swim_In_Rising_Water {

    static class Pair implements Comparable<Pair> {

        int x;
        int y;
        int wt;

        public Pair(int x, int y, int wt) {
            this.x = x;
            this.y = y;
            this.wt = wt;
        }

        @Override
        public int compareTo(Pair p) {
            return Integer.compare(this.wt, p.wt);
        }
    }

    public static int swimInWater(int[][] grid) {
        int n = grid.length;
        int[][] dist = new int[n][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        dist[0][0] = grid[0][0];
        pq.add(new Pair(0, 0, grid[0][0]));

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            int x = curr.x;
            int y = curr.y;
            int wt = curr.wt;
            if (x == n - 1 && y == n - 1) {
                return wt;
            }
            if (wt > dist[x][y]) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                    int maxTime = Math.max(wt, grid[newX][newY]);
                    if (maxTime < dist[newX][newY]) {
                        dist[newX][newY] = maxTime;
                        pq.add(new Pair(newX, newY, maxTime));
                    }
                }
            }
        }

        return dist[n - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16}, {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}};
        System.out.println(swimInWater(grid));
    }
}
