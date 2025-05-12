package medium.dp;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] cache = new int[m][n];

        return dfs(0, 0, cache, obstacleGrid);
    }

    private int dfs(int row, int col, int[][] cache, int[][] obstacleGrid) {
        if (row == cache.length || col == cache[0].length || obstacleGrid[row][col] == 1) {
            return 0;
        }

        if (cache[row][col] > 0) {
            return cache[row][col];
        }

        if (row == cache.length - 1 && col == cache[0].length - 1) {
            return 1;
        }

        return cache[row][col] = dfs(row + 1, col, cache, obstacleGrid) + dfs(row, col + 1, cache, obstacleGrid);

    }
}
