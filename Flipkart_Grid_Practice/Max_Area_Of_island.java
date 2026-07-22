package Flipkart_Grid_Practice;

public class Max_Area_Of_island {
    int max=0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int row,int col){
        if(row<0 || row>=grid.length
        || col<0 || col>=grid[0].length
        || grid[row][col]==0)   return 0;

        grid[row][col]=0;
        int up=dfs(grid,row-1,col);
        int down=dfs(grid,row+1,col);
        int left=dfs(grid,row,col-1);
        int right=dfs(grid,row,col+1);
        return 1+up+down+left+right;
    }
}
