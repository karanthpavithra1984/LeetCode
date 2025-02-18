package medium.Matrix;

import java.util.ArrayDeque;
import java.util.Queue;

public class HighestPeak {
    private int ROWS;
    private int COLS;

    public int[][] highestPeak(int[][] isWater) {
        ROWS = isWater.length;
        COLS = isWater[0].length;

        boolean[][] visited = new boolean[ROWS][COLS];
        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (isWater[i][j] == 1) {
                    //Add all the water and start bfs on them
                    visited[i][j] = true;
                    isWater[i][j] = 0;
                    queue.add(new int[]{i, j});
                }
            }
        }

        bfs(isWater, visited, queue);
        return isWater;
    }

    private void bfs(int[][] isWater, boolean[][] visited, Queue<int[]> queue) {
        while (!queue.isEmpty()) {

            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];

            int[][] neighbors = new int[][]{{r, c + 1}, {r + 1, c}, {r - 1, c}, {r, c - 1}};

            for (int j = 0; j < neighbors.length; j++) {
                int newRow = neighbors[j][0];
                int newCol = neighbors[j][1];

                if (newRow < 0 || newRow >= ROWS || newCol < 0 || newCol >= COLS || visited[newRow][newCol]) {
                    continue;
                }

                visited[newRow][newCol] = true;
                isWater[newRow][newCol] = isWater[r][c] + 1;
                queue.add(new int[]{newRow, newCol});
            }

        }
    }
}
