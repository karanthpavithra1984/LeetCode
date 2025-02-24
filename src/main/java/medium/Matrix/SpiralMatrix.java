package medium.Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        dfs(matrix, result, 0,0);
        return result;
    }

    private void dfs(int[][] matrix, List<Integer> result, int row, int col) {
        if(row < 0 || row >= matrix.length || col < 0
                || col >= matrix[0].length || matrix[row][col] == 101){
            return;
        }

        result.add(matrix[row][col]);
        matrix[row][col] = 101;

        if(row == 0 || matrix[row-1][col] == 101){
            dfs(matrix, result, row, col+1);
        }

        dfs(matrix, result, row+1, col);
        dfs(matrix, result, row, col-1);
        dfs(matrix, result, row-1, col);
    }
}
