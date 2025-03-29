package hard.Djikstra;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SwimInRisingWater {
    public int swimInWater(int[][] grid) {
        int ROW =grid.length;
        int COL = grid[0].length;


        int[][] dirs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        int time = grid[0][0];

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        priorityQueue.offer(new int[]{0,0,time});

        boolean[][] visited = new boolean[ROW][COL];
        visited[0][0] = true;

        while(!priorityQueue.isEmpty()){
            int[] polledValue = priorityQueue.poll();
            int row = polledValue[0];
            int col = polledValue[1];
            int curTime = polledValue[2];

            if(row == ROW-1 && col == COL-1){
                return  curTime;
            }

            for(int[] dir: dirs){
                int newRow = dir[0] + row;
                int newCol = dir[1] + col;

                if( newRow < 0 || newRow >= ROW || newCol <0 || newCol >= COL || visited[newRow][newCol] ){
                    continue;
                }

                visited[newRow][newCol] = true;

                priorityQueue.offer(new int[]{newRow, newCol, Math.max(curTime, grid[newRow][newCol])});
            }
        }

        return 0;
    }
}
