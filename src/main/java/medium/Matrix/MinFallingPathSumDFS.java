package medium.Matrix;

public class MinFallingPathSumDFS {
    public int minFallingPathSum(int[][] matrix) {
        Integer[][] dp = new Integer[matrix.length][matrix.length];
        int minimumValue = Integer.MAX_VALUE;

        //Do dfs on cols only
        for (int col = 0; col < matrix.length; col++) {
            minimumValue = Math.min(minimumValue, findPathMinimum(matrix, 0, col, dp));
        }

        return minimumValue;
    }

    private int findPathMinimum(int[][] matrix, int row, int col, Integer[][] dp) {
        if (col < 0 || col >= matrix.length) {
            return Integer.MAX_VALUE;
        }

        //if we have reached the end
        if (row == matrix.length - 1) {
            return matrix[row][col];
        }

        if (dp[row][col] != null) {
            return dp[row][col];
        }

        int left = findPathMinimum(matrix, row + 1, col - 1, dp);
        int center = findPathMinimum(matrix, row + 1, col, dp);
        int right = findPathMinimum(matrix, row + 1, col + 1, dp);

        return dp[row][col] = Math.min(left, Math.min(center, right)) + matrix[row][col];
    }
}
