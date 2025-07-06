package medium.dp;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        Integer[][] dp = new Integer[grid.length + 1][grid[0].length + 1];

        for (int r = grid.length - 1; r >= 0; r--) {
            for (int c = grid[0].length - 1; c >= 0; c--) {
                if (dp[r][c + 1] == null && dp[r + 1][c] == null) {
                    dp[r][c] = grid[r][c];
                } else {
                    dp[r][c] = grid[r][c] + Math.min(dp[r][c + 1] == null ? Integer.MAX_VALUE : dp[r][c + 1],
                            dp[r + 1][c] == null ? Integer.MAX_VALUE : dp[r + 1][c]);
                }
            }
        }

        return dp[0][0];
    }
}
