package Leetcode;

import java.util.*;

public class Find_Safe_Walk_Through_Grid {
    static int best[][];
    public static boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int row = grid.size(), col = grid.get(0).size();
        best = new int[row][col];
        for (int[] r : best) Arrays.fill(r, -1);
        int result = helper(0, 0, health, " ", row, col, grid);
        return result >= 1;
    }
    public static int helper(int i,int j,int health,String dir,int row,int col,List<List<Integer>> grid){
        if(grid.get(i).get(j)==1)   health--;
        if (health <= 0) return Integer.MIN_VALUE;
        if (i == row - 1 && j == col - 1) {            
            best[i][j] = Math.max(best[i][j], health);
            return health;
        }
        if (health <= best[i][j]) return 0;            
        best[i][j] = health; 
        int down=0;
        if(i<row-1 && !dir.equals("up")) down=helper(i+1,j,health,"down",row,col,grid);
        int right=0;
        if(j<col-1 && !dir.equals("left")) right=helper(i,j+1,health,"right",row,col,grid);
        int left=0;
        if(j>0 && !dir.equals("right")) left=helper(i,j-1,health,"left",row,col,grid);
        int up=0;
        if(i>0 && !dir.equals("down")) up=helper(i-1,j,health,"up",row,col,grid);
        return Math.max(Math.max(down,up),Math.max(left,right));
    }
    public static void main(String[] args) {
        List<List<Integer>> grid = new ArrayList<>(
            Arrays.asList(
                new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0)),
                new ArrayList<>(Arrays.asList(0, 1, 0, 1, 0)),
                new ArrayList<>(Arrays.asList(0, 0, 0, 1, 0))
            )
        );
        int health=1;
        System.out.println(findSafeWalk(grid, health));
    }
}
