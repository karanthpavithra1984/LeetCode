package medium.Djikstras;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PathWithMinimumMaximumValue {
    public int maximumMinimumPath(int[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;

        int minValue = grid[0][0];

        //We need descending order
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> -a[2]));
        queue.offer(new int[]{0,0, grid[0][0]});

        boolean[][] visited = new boolean[ROW][COL];
        visited[0][0] = true;


        int[][] dirs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};

        while(!queue.isEmpty()){
            int[] polledValue = queue.poll();
            int row = polledValue[0];
            int col = polledValue[1];
            int value = polledValue[2];

            minValue = Math.min(minValue, value);

            if(row == ROW-1 && col == COL-1){
                return minValue;
            }

            for(int[] dir: dirs){
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if(newRow < 0 || newRow >= ROW || newCol < 0 || newCol >= COL || visited[newRow][newCol]){
                    continue;
                }
                visited[newRow][newCol]= true;
                int newValue = grid[newRow][newCol];
                queue.offer(new int[]{newRow, newCol, newValue});
            }
        }

        return minValue;
    }
}
