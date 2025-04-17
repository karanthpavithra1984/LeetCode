package medium.Matrix;

import java.util.ArrayDeque;
import java.util.Queue;

public class ShortestPathToFood {
    public int getFood(char[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;

        boolean[][] visited = new boolean[ROW][COL];

        Queue<int[]> queue = new ArrayDeque<>();

        for(int r=0; r < ROW; r++){
            for(int c=0; c<COL; c++){
                if(grid[r][c] == '*'){
                    queue.add(new int[]{r,c});
                    visited[r][c] = true;
                    break;
                }
            }
        }

        return bfs(queue, grid,visited, ROW, COL);
    }

    private int bfs(Queue<int[]> queue, char[][] grid, boolean[][] visited, int ROW, int COL) {
        int steps = 1;
        int[][] neighbors = new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                int[] rc =  queue.poll();
                int row = rc[0];
                int col = rc[1];

                for(int[] neighbor: neighbors){
                    int newRow = neighbor[0] + row;
                    int newCol = neighbor[1] + col;

                    if(newRow < 0 || newRow >= ROW || newCol < 0 || newCol >= COL || visited[newRow][newCol] || grid[newRow][newCol] == 'X'){
                        continue;
                    }

                    visited[newRow][newCol]= true;
                    if(grid[newRow][newCol] == '#'){
                        return steps;
                    }

                    queue.add(new int[]{newRow, newCol});
                }
            }
            steps++;
        }

        return -1;
    }

}
