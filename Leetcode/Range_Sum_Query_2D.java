package Leetcode;

public class Range_Sum_Query_2D {
        static int mat[][];
        static int pre[][];
        public Range_Sum_Query_2D(int[][] matrix) {
            int r=matrix.length;
            int c=matrix[0].length;
            pre=new int[r+1][c+1];
            mat=new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    mat[i][j]=matrix[i][j];
                    pre[i+1][j+1]=mat[i][j]-pre[i][j]+pre[i][j+1]+pre[i+1][j];
                }
            }
        }
        
        public static int sumRegion(int row1, int col1, int row2, int col2) {
            return pre[row2+1][col2+1]- pre[row1][col2 + 1]
             - pre[row2 + 1][col1]
             + pre[row1][col1];
        }
        public static void main(String[] args) {
            int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
            };
            Range_Sum_Query_2D obj=new Range_Sum_Query_2D(matrix);
            System.out.println(obj.sumRegion(0, 0, 1, 1));

        }
}

