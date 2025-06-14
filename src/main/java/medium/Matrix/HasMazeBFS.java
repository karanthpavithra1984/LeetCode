package medium.Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class HasMazeBFS {
    int[][] directions = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int R = maze.length;
        int C = maze[0].length;

        boolean[][] visited = new boolean[R][C];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(start);

        visited[start[0]][start[1]] = true;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            for (int[] direction : directions) {
                int startR = curr[0];
                int startC = curr[1];
                int dirR = direction[0];
                int dirC = direction[1];

                while (startR + dirR >= 0 && startC + dirC >= 0 && startR + dirR < R && startC + dirC < C
                        && maze[startR + dirR][startC + dirC] == 0) {
                    startR += dirR;
                    startC += dirC;
                }

                if (!visited[startR][startC]) {
                    if (startR == destination[0] && startC == destination[1]) {
                        return true;
                    }
                    visited[startR][startC] = true;
                    queue.offer(new int[] { startR, startC });
                }
            }
        }

        return false;
    }
}
