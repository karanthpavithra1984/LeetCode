package medium.Matrix;

public class LongestIncreasingPathInMatrix {
    int ROWS,COLS;
    public int longestIncreasingPath(int[][] matrix) {
        ROWS = matrix.length;
        COLS = matrix[0].length;

        int[][] dp = new int[ROWS][COLS];

        int answer = 0;

        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLS; j++) {
                answer = Math.max(answer, dfs(matrix, i, j, dp));
            }
        }

        return answer;
    }

    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private int dfs(int[][] matrix, int row, int col, int[][] dp) {
        if(dp[row][col] != 0) {
            return dp[row][col];
        }

        int result = 1; // Start with the current cell
        for(int i = 0; i < 4; i++) {
            int newRow = row + directions[i][0];
            int newCol = col + directions[i][1];
            if(newRow >= 0 && newRow < ROWS && newCol >= 0 && newCol < COLS && matrix[newRow][newCol] > matrix[row][col]) {
                result = Math.max(result, 1+ dfs(matrix, newRow, newCol, dp));
            }
        }

        return dp[row][col] = result; // Store the result in dp array
    }
}
