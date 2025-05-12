package easy.Matrix;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int ROW = mat.length;
        int COL = mat[0].length;

        int sum = 0;
        for (int i = 0; i < ROW; i++) {
            sum += mat[i][i];
            if (i != COL - 1 - i)
                sum += mat[i][COL - 1 - i];
        }

        return sum;
    }
}
