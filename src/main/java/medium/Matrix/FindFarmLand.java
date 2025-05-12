package medium.Matrix;

import java.util.ArrayList;
import java.util.List;

public class FindFarmLand {
    private int ROW;
    private int COL;
    private int secondRow;
    private int secondCol;

    public int[][] findFarmland(int[][] land) {
        ROW = land.length;
        COL = land[0].length;

        boolean[][] visited = new boolean[ROW][COL];
        List<int[]> coordinates = new ArrayList<>();

        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                if (land[row][col] == 1 && !visited[row][col]) {
                    secondRow = 0;
                    secondCol = 0;

                    dfs(land, visited, row, col);
                    coordinates.add(new int[]{row, col, secondRow, secondCol});
                }
            }
        }

        return coordinates.toArray(new int[coordinates.size()][]);
    }

    private void dfs(int[][] land, boolean[][] visited, int row, int col) {
        if (row < 0 || row >= ROW || col < 0 || col >= COL || visited[row][col] || land[row][col] == 0) {
            return;
        }
        //Dfs will trigger recursion , so choose the maximum cooridates
        secondRow = Math.max(row, secondRow);
        secondCol = Math.max(col, secondCol);

        visited[row][col] = true;
        dfs(land, visited, row, col + 1);
        dfs(land, visited, row, col - 1);
        dfs(land, visited, row + 1, col);
        dfs(land, visited, row - 1, col);
    }
}
