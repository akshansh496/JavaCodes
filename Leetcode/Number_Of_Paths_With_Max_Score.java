package Leetcode;

import java.util.Arrays;
import java.util.List;

public class Number_Of_Paths_With_Max_Score {
    static final int MOD = 1_000_000_007;
    public static int[] pathsWithMaxScore(List<String> board) {
        int n=board.size();
        int score[][]=new int[n][n];
        int ways[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(score[i],-1);
        }
        score[0][0]=0;
        ways[0][0]=1;
        for (int j = 1; j < n; j++) {
            if (board.get(0).charAt(j) == 'X' || score[0][j-1] == -1)
                continue;
            int value = board.get(0).charAt(j) == 'S' ? 0 : board.get(0).charAt(j) - '0';
            score[0][j] = score[0][j-1] + value;
            ways[0][j] = ways[0][j-1];
        }
        for (int i = 1; i < n; i++) {
            if (board.get(i).charAt(0) == 'X' || score[i-1][0] == -1)
                continue;
            int value = board.get(i).charAt(0) == 'S' ? 0 : board.get(i).charAt(0) - '0';
            score[i][0] = score[i-1][0] + value;
            ways[i][0] = ways[i-1][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                char ch = board.get(i).charAt(j);
                if (ch == 'X')
                    continue;
                int best=Math.max(score[i-1][j],Math.max(score[i-1][j-1],score[i][j-1]));
                if(best==-1)    continue;
                
                int val=ch=='S'?0:ch-'0';
                score[i][j]=best+val;

                if (score[i - 1][j] == best)
                    ways[i][j] = (ways[i][j] + ways[i - 1][j]) % MOD;

                if (score[i][j - 1] == best)
                    ways[i][j] = (ways[i][j] + ways[i][j - 1]) % MOD;

                if (score[i - 1][j - 1] == best)
                    ways[i][j] = (ways[i][j] + ways[i - 1][j - 1]) % MOD;
            }
        }
        if(score[n-1][n-1]==-1) return new int[]{0,0};
        else return new int[]{score[n-1][n-1],ways[n-1][n-1]};
    }
    public static void main(String[] args) {
        List<String> board = Arrays.asList(
            "E23",
            "2X2",
            "12S"
        );
        int arr[]=pathsWithMaxScore(board);
        System.out.println(Arrays.toString(arr));
    }
}
