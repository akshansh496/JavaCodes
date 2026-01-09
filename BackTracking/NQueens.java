package BackTracking;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        String board[][]=new String[n][n];
        insert(n,board);
    }
    public static void insert(int n,String board[][]){
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                board[i][j]="*";
            }
        }
        placeQueen(n, board, 0);
    }
    public static void placeQueen(int n,String board[][],int i){
        if(i==n){
            print(n, board);
            return;
        }
        for (int j = 0; j < n; j++) {
            if(isSafe(i, j, board)){
            board[i][j]="Q";
            placeQueen(n, board, i+1);
            board[i][j]="*";
            }
        }
    }
    public static boolean isSafe(int i,int j,String board[][]){
        for(int idx=i-1;idx>=0;idx--){
            if(board[idx][j].equals("Q"))
            return false;
        }
        for(int idx=i-1,col=j-1;idx>=0 && col>=0;idx--,col--){
            if(board[idx][col].equals("Q"))
            return false;
        }
        for(int idx=i-1,col=j+1;idx>=0 && col<board.length;idx--,col++){
            if(board[idx][col].equals("Q"))
            return false;
        }
        return true;
    }
    public static void print(int n,String board[][]){
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
}
