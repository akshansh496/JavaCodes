package Leetcode;

public class Word_Search {

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (helper(board, word, 0, i, j, new boolean[board.length][board[0].length])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean helper(char[][] board, String word, int idx, int i, int j, boolean visited[][]) {
        if (idx == word.length()) {
            return true;
        }
        if (board[i][j] != word.charAt(idx)) {
            return false;
        }
        if (visited[i][j]) {
            return false;
        }
        if (idx == word.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        boolean top = false, down = false, left = false, right = false;
        if (i > 0) {
            top = helper(board, word, idx + 1, i - 1, j, visited);
        }
        if (i < board.length - 1) {
            down = helper(board, word, idx + 1, i + 1, j, visited);
        }
        if (j > 0) {
            left = helper(board, word, idx + 1, i, j - 1, visited);
        }
        if (j < board[0].length - 1) {
            right = helper(board, word, idx + 1, i, j + 1, visited);
        }
        visited[i][j] = false;
        return (top || down) || (left || right);
    }

    public static void main(String[] args) {

        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";

        System.out.println(exist(board, word));
    }
}
