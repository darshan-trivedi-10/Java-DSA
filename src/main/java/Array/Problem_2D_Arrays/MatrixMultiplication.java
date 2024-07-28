package Array.Problem_2D_Arrays;

public class MatrixMultiplication {
    public static void multiplyAndPrintResult(int[][] m1, int[][] m2) {
        int r1 = m1.length, c1 = m1[0].length;
        int r2 = m2.length, c2 = m2[0].length;

        int row = r1, col = c2;

        if (c1 != r2){
            System.out.println("Matrix Multiplication is not Possible :(");
        }

        int[][]resultMatrix = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                for(int k = 0; k < c1; k++){
                    resultMatrix[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] m2 = { { 1, 1 }, { 1, 2 }, { 2, 1 } };
        multiplyAndPrintResult(m1, m2);
    }
}
