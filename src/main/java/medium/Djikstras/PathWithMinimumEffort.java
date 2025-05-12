package medium.Djikstras;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PathWithMinimumEffort {
    public int minimumEffortPath(int[][] heights) {
        int ROW = heights.length;
        int COL = heights[0].length;
        int[][] differences = new int[ROW][COL];
        for (int[] difference : differences) {
            Arrays.fill(difference, Integer.MAX_VALUE);
        }
        differences[0][0] = 0;


        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        //Start with first
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        priorityQueue.add(new int[]{0, 0, 0});

        while (!priorityQueue.isEmpty()) {
            int[] polled = priorityQueue.poll();

            int row = polled[0];
            int col = polled[1];
            int diff = polled[2];

            //Reached the end
            if (row == ROW - 1 && col == COL - 1) {
                return diff;
            }

            for (int[] dir : dirs) {
                int newRow = dir[0] + row;
                int newCol = dir[1] + col;

                if (newRow < 0 || newCol < 0 || newRow >= ROW || newCol >= COL) {
                    continue;
                }

                int newDiff = Math.max(diff, Math.abs(heights[newRow][newCol] - heights[row][col]));

                if (newDiff < differences[newRow][newCol]) {
                    differences[newRow][newCol] = newDiff;
                    priorityQueue.offer(new int[]{newRow, newCol, newDiff});
                }
            }
        }


        return 0;
    }
}
