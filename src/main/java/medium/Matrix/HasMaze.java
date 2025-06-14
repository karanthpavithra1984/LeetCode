package medium.Matrix;

public class HasMaze {
    int[][] directions = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int R = maze.length;
        int C = maze[0].length;

        boolean[][] visited = new boolean[R][C];

        return dfs(maze, visited, R, C, start[0], start[1], destination[0], destination[1]);
    }

    private boolean dfs(int[][] maze,
                        boolean[][] visited, int R, int C, int startr, int startc,
                        int destinationr, int destinationc) {
        //The ball is already rolling over
        if (visited[startr][startc])
            return false;

        if (startc == destinationc && startr == destinationr) {
            return true;
        }
        visited[startr][startc] = true;

        for (int[] d : directions) {
            int dirR = d[0];
            int dirC = d[1];
            int newR = startr, newC = startc;

            //Try to reach the end as the ball is rolling over
            while (newR + dirR >= 0 && newC + dirC >= 0 && newR + dirR < R && newC + dirC < C
                    && maze[newR + dirR][newC + dirC] == 0) {
                newC += dirC;
                newR += dirR;
            }

            if (dfs(maze, visited, R, C, newR, newC, destinationr, destinationc))
                return true;
        }

        return false;
    }
}
