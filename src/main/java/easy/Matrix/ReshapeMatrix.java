package easy.Matrix;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int R = mat.length;
        int C = mat[0].length;

        if (r * c != R * C)
            return mat;

        int[][] res = new int[r][c];

        int row = 0;
        int col = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {

                int val = mat[i][j];

                res[row][col++] = val;
                if (col == c) {
                    row++;
                    col = 0;
                }

            }
        }

        return res;
    }
}
