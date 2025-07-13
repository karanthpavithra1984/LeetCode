package medium.Matrix;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        dfs(matrix, 0, 0, 1, false);

        return matrix;
    }

    private void dfs(int[][] matrix, int row, int col, int value, boolean up) {
        if (row < 0 || row >= matrix.length || col < 0
                || col >= matrix[0].length) {
            return;
        }

        if (matrix[row][col] != 0) {
            return;
        }

        matrix[row][col] = value;

        if (up) {
            dfs(matrix, row - 1, col, value + 1, true);
        }

        dfs(matrix, row, col + 1, value + 1, false);
        dfs(matrix, row + 1, col, value + 1, false);
        dfs(matrix, row, col - 1, value + 1, false);
        dfs(matrix, row - 1, col, value + 1, true);
    }
}
