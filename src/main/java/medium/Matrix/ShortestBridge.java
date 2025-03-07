package medium.Matrix;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Time Complexity o(n2)
 * Space Complexity o(n2)
 */

public class ShortestBridge {
    private final int[][] neighbors = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public int shortestBridge(int[][] grid) {
        int length = grid.length;

        boolean[][] visited = new boolean[length][length];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                //Get the island first and them to the queue
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, length, queue, visited);
                    //Just look for the first island
                    //Return BFS
                    return bfs(queue, grid, visited, length);
                }
            }
        }

        return -1;
    }

    private int bfs(Queue<int[]> queue, int[][] grid, boolean[][] visited, int length) {
        int res = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int curRow = cur[0];
                int curCol = cur[1];
                //Run bfs on the current
                for (int[] neighbor : neighbors) {
                    int newRow = curRow + neighbor[0];
                    int newCol = curCol + neighbor[1];


                    if (isInvalid(newRow, newCol, length) || visited[newRow][newCol]) {
                        continue;
                    }

                    //You have reached next island good job
                    if (grid[newRow][newCol] == 1) {
                        return res;
                    }

                    visited[newRow][newCol] = true;
                    queue.add(new int[]{newRow, newCol});
                }
            }

            res++;
        }

        return -1;

    }

    private void dfs(int[][] grid, int row, int col, int length, Queue<int[]> queue, boolean[][] visited) {
        if (isInvalid(row, col, length) || grid[row][col] == 0 || visited[row][col]) {
            return;
        }

        visited[row][col] = true;
        queue.add(new int[]{row, col});

        for (int[] neighbor : neighbors) {
            dfs(grid, row + neighbor[0], col + neighbor[1], length, queue, visited);
        }
    }

    private boolean isInvalid(int row, int col, int length) {
        if (row < 0 || col < 0 || row >= length || col >= length) {
            return true;
        }
        return false;
    }
}
