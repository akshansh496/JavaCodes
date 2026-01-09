import java.util.Scanner;

public class MatrixMultiplication {
    
    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int row1, int col1, int col2) {
        int[][] result = new int[row1][col2];
        
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                int sum=0;
                for (int k = 0; k < col1; k++) {
                    sum+=firstMatrix[i][k] * secondMatrix[k][j];
                }
                result[i][j]=sum; 
            }
        }
        
        return result;
    }
    
    // Function to take matrix input
    public static int[][] inputMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    
    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for matrices A, B, and C
        System.out.print("Enter rows and columns of matrix A: ");
        int rowA = scanner.nextInt();
        int colA = scanner.nextInt();
        int[][] A = inputMatrix(scanner, rowA, colA);
        
        System.out.print("Enter rows and columns of matrix B: ");
        int rowB = scanner.nextInt();
        int colB = scanner.nextInt();
        int[][] B = inputMatrix(scanner, rowB, colB);
        
        System.out.print("Enter rows and columns of matrix C: ");
        int rowC = scanner.nextInt();
        int colC = scanner.nextInt();
        int[][] C = inputMatrix(scanner, rowC, colC);
        
        // Check if multiplication A * B is possible
        if (colA != rowB) {
            System.out.println("Matrix multiplication A * B is not possible with given dimensions.");
            return;
        }
        
        // Multiply A * B
        int[][] AB = multiplyMatrices(A, B, rowA, colA, colB);
        
        // Check if multiplication (A * B) * C is possible
        if (colB != rowC) {
            System.out.println("Matrix multiplication (A * B) * C is not possible with given dimensions.");
            return;
        }
        
        // Multiply (A * B) * C
        int[][] ABC = multiplyMatrices(AB, C, rowA, colB, colC);
        
        // Printing all matrices
        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);
        System.out.println("Matrix C:");
        printMatrix(C);
        System.out.println("Matrix A * B:");
        printMatrix(AB);
        System.out.println("Matrix A * B * C:");
        printMatrix(ABC);
        
        scanner.close();
    }
}
