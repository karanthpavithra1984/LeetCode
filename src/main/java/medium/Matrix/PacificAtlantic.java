package medium.Matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(m*n)
 * Space Complexity o(m*n)
 */

public class PacificAtlantic {
    int ROWS;
    int COLS;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        ROWS = heights.length;
        COLS = heights[0].length;
        boolean[][] pacific = new boolean[ROWS][COLS];
        boolean[][] atlantic = new boolean[ROWS][COLS];
        List<List<Integer>> result = new ArrayList<>();

        //Go over the borders
        //Row first
        for (int row = 0; row < ROWS; row++) {
            dfs(row, 0, heights[row][0], pacific, heights); //Pacific bound
            dfs(row, COLS - 1, heights[row][COLS - 1], atlantic, heights);//atlantic bound
        }

        //Col
        for (int col = 0; col < COLS; col++) {
            dfs(0, col, heights[0][col], pacific, heights); //Pacific bound
            dfs(ROWS - 1, col, heights[ROWS - 1][col], atlantic, heights); //atlantic bound
        }

        //Anything which are marked pacific and atlantic bound are something we should consider

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (pacific[row][col] && atlantic[row][col]) {
                    result.add(List.of(row, col));
                }
            }
        }


        return result;

    }

    private void dfs(int row, int col, int prev, boolean[][] oceanBound, int[][] heights) {
        //Usual conditions first
        //Additionaly the current height should be less than previous height
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS || oceanBound[row][col] || heights[row][col] < prev) {
            return;
        }

        oceanBound[row][col] = true;

        dfs(row + 1, col, heights[row][col], oceanBound, heights);
        dfs(row - 1, col, heights[row][col], oceanBound, heights);
        dfs(row, col + 1, heights[row][col], oceanBound, heights);
        dfs(row, col - 1, heights[row][col], oceanBound, heights);

    }
}
