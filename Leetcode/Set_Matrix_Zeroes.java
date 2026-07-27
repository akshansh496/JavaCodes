package Leetcode;

import java.util.Arrays;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for(int[] m:matrix)
        System.out.println(Arrays.toString(m));
    }
    public static void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean firstRow=false;
        for(int i=0;i<n;i++){
            if(matrix[0][i]==0) firstRow=true;
        }
        boolean firstCol=false;
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0) firstCol=true;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            if(matrix[i][0]==0){
                int idx=0;
                while(idx<n){
                    matrix[i][idx++]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(matrix[0][i]==0){
                int idx=0;
                while(idx<m){
                    matrix[idx++][i]=0;
                }
            }
        }
        if(firstRow){
            for(int i=0;i<n;i++)    matrix[0][i]=0;
        }
        if(firstCol){
            for(int i=0;i<m;i++)    matrix[i][0]=0;
        }
    }
}
