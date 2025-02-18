package medium.Matrix;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * o(n*m)
 */

public class Matrix01 {
    private int ROWS;
    private int COLUMNS;

    public int[][] updateMatrix(int[][] mat) {
        ROWS = mat.length;
        COLUMNS = mat[0].length;

        boolean[][] visited = new boolean[mat.length][mat[0].length];
        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        bfs(mat, queue, visited);
        return mat;
    }

    private void bfs(int[][] mat, Queue<int[]> queue, boolean[][] visited) {
        while (!queue.isEmpty()) {

            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];

            int[][] neighbors = new int[][]{{r, c + 1}, {r + 1, c}, {r - 1, c}, {r, c - 1}};

            for (int i = 0; i < neighbors.length; i++) {
                int newRow = neighbors[i][0];
                int newCol = neighbors[i][1];
                if (newRow < 0 || newRow >= ROWS || newCol < 0 || newCol >= COLUMNS || visited[newRow][newCol]) {
                    continue;
                }

                visited[newRow][newCol] = true;
                queue.add(new int[]{newRow, newCol});
                mat[newRow][newCol] = mat[r][c] + 1;
            }
        }
    }

}
