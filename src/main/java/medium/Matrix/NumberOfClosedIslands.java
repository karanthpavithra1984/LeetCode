package medium.Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfClosedIslands {
    private int ROWS;
    private int COLS;

    public int closedIsland(int[][] grid) {
        ROWS = grid.length;
        COLS = grid[0].length;

        int count = 0;
        boolean[][] visited = new boolean[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == 0 && !visited[i][j] && !isBoundaryAndBfs(i, j, grid, visited)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isBoundaryAndBfs(int k, int j, int[][] grid, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{k, j});
        visited[k][j] = true;
        boolean isBoundary = false;

        while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                int[][] neighbors = new int[][]{{r, c + 1}, {r + 1, c}, {r - 1, c}, {r, c - 1}};

                for (int i = 0; i < neighbors.length; i++) {
                    int newRow = neighbors[i][0];
                    int newCol = neighbors[i][1];

                    if (newRow < 0 || newRow >= ROWS || newCol < 0 || newCol >= COLS) {
                        isBoundary = true;
                        continue;
                    }

                    if (visited[newRow][newCol]) {
                        continue;
                    }

                    queue.add(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        return isBoundary;
    }
}
