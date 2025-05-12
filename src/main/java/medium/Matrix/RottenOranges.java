package medium.Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    int ROW;
    int COL;
    int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int orangesRotting(int[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;

        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                if (grid[r][c] == 2) {
                    queue.add(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    freshOranges++; //Count fresh Oranges
                }
            }
        }
        int length = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotten = false;

            for (int i = 0; i < size; i++) {
                int[] rottenOr = queue.poll();

                for (int[] dir : directions) {
                    int newRow = rottenOr[0] + dir[0];
                    int newCol = rottenOr[1] + dir[1];

                    if (newRow < 0 || newRow >= ROW || newCol < 0 || newCol >= COL
                            || grid[newRow][newCol] == 2 || grid[newRow][newCol] == 0) {
                        continue;
                    }

                    grid[newRow][newCol] = 2;
                    rotten = true;
                    freshOranges--;

                    queue.offer(new int[]{newRow, newCol});
                }
            }

            if (rotten) length++;
        }

        return freshOranges > 0 ? -1 : length;
    }

}
