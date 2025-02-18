package medium.Matrix;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * o(n)
 */
public class ShortestPathBinaryMatrix {
    /**
     * Remember when ur calculating the length or shortest path , you might have to do a for loop inside the while loop of queue
     *
     * @param grid
     * @return
     */
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1) return -1;
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int length = 1;
        boolean[][] visited = new boolean[rowLength][colLength];

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0,0});
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                int[] cur = queue.poll();
                int row = cur[0];
                int col = cur[1];

                //Reached the end of the matrix
                if(row == rowLength - 1 && col == colLength - 1) {
                    return length;
                }

                //Define neighbors. Here we need to consider the diagonals as well
                int[][] neighbors = new int[][]{{row, col+1},{row, col-1},{row+1, col},
                        {row-1, col}, {row-1, col-1},{row+1, col+1},{row+1, col-1}, {row-1, col+1}};

                for(int[] neighbor : neighbors) {
                    int newRow = neighbor[0];
                    int newCol = neighbor[1];
                    if(newRow < 0 || newRow >= rowLength || newCol < 0 ||
                            newCol >= colLength ||
                            visited[newRow][newCol] || grid[newRow][newCol] == 1) continue;

                    visited[newRow][newCol] = true;
                    queue.add(new int[]{newRow, newCol});
                }
            }

            length++;
        }

        return -1;
    }

}
