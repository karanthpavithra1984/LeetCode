package medium.dp;

public class UniquePathsTopDown {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        return dfs(0, 0, dp);
    }

    private int dfs(int row, int col, int[][] dp) {
        if (row == dp.length || col == dp[0].length) {
            return 0;
        }

        //if in cache return it
        if (dp[row][col] > 0) {
            return dp[row][col];
        }

        //End of the matrix , found a path
        if (row == dp.length - 1 && col == dp[0].length - 1) {
            return 1;
        }

        return dp[row][col] = dfs(row + 1, col, dp) + dfs(row, col + 1, dp);
    }
}
