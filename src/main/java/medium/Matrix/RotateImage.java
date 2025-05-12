package medium.Matrix;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int ROW = matrix.length;
        int COL = matrix[0].length;

        //Transpose
        for (int i = 0; i < ROW; i++) {
            for (int j = i + 1; j < COL; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        //Reverse
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL / 2; j++) {
                int temp = matrix[i][ROW - j - 1];
                matrix[i][ROW - j - 1] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
