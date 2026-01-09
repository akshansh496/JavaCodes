package BackTracking;

public class KnightTour {
    public static void main(String[] args) {
        int board[][]=new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = -1;
            }
        }
        if (moves(0, 0, board, 0)) {
            print(board);
        } else {
            System.out.println("No solution found");
        }
    }
    public static boolean moves(int xidx,int yidx,int board[][],int move){
        if(!isSafe(xidx, yidx, board))
        return false;

        board[xidx][yidx]=move;

        if(move==board.length * board.length - 1)
        return true;

        if (
            moves(xidx + 2, yidx + 1, board, move + 1) ||
            moves(xidx + 2, yidx - 1, board, move + 1) ||
            moves(xidx - 2, yidx + 1, board, move + 1) ||
            moves(xidx - 2, yidx - 1, board, move + 1) ||
            moves(xidx - 1, yidx + 2, board, move + 1) ||
            moves(xidx + 1, yidx + 2, board, move + 1) ||
            moves(xidx - 1, yidx - 2, board, move + 1) ||
            moves(xidx + 1, yidx - 2, board, move + 1)
        ) {
            return true;
        }
        board[xidx][yidx]=-1;
        return false;

    }
    public static boolean isSafe(int xidx,int yidx,int board[][]){
        if(xidx<0 || xidx>6)
        return false;
        if(yidx<0 || yidx>6)
        return false;
        if(board[xidx][yidx]!=-1)
        return false;
        return true;
    }
    public static void print(int board[][]){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
