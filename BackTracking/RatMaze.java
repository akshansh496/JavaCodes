package BackTracking;
public class RatMaze {
    public static void main(String[] args) {
        int n=4,m=4;
        int maze[][] ={
            {1, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 1, 1},
            {0, 0, 1, 1}
        };
        System.out.println(ways(0, 0, n, m,maze,new int[n][m]));
        // print(maze, n, m);
    }
    public static int ways(int i,int j,int n,int m,int maze[][],int solution[][]){
        if (i < 0 || j < 0 || i >= n || j >= m) return 0;
        if (maze[i][j] == 0 ) return 0; 
        if(i==n-1 && j==m-1){
            solution[i][j]=1;
            print(solution,n,m);
            return 1;
        } 
        solution[i][j]=1;
        maze[i][j] = 0; //mark for other paths
        int total = ways(i, j - 1, n, m, maze,solution) // Left
                  + ways(i, j + 1, n, m, maze,solution) // Right
                  + ways(i - 1, j, n, m, maze,solution) // Up
                  + ways(i + 1, j, n, m, maze,solution);//down
        maze[i][j] = 1;  // unmark for other paths
        solution[i][j] = 0; //
        return total;
    }
    public static void print(int solution [][],int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(solution [i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }
}
