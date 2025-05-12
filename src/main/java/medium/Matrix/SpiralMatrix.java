package medium.Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int ROW = matrix.length;
        int COL = matrix[0].length;

        List<Integer> result = new ArrayList<>();
        boolean[][] visited = new boolean[ROW][COL];

        dfs(matrix, result, visited, 0, 0);
        return result;
    }

    private void dfs(int[][] matrix, List<Integer> result, boolean[][] visited, int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0
                || col >= matrix[0].length || visited[row][col]) {
            return;
        }

        result.add(matrix[row][col]);
        visited[row][col] = true;

        if (row == 0 || visited[row - 1][col]) {
            dfs(matrix, result, visited, row, col + 1);
        }

        dfs(matrix, result, visited, row + 1, col);
        dfs(matrix, result, visited, row, col - 1);
        dfs(matrix, result, visited, row - 1, col);
    }
}
