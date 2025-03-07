package medium.Matrix;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Time Complexity is o(m*n) - It has to go through all the cells
 * Space Complexity is
 * Queue -> you add 1 , remove it and add 4 more. For the second one you remove 1, and then add 4 more, so 7
 * o(m+n)
 * Visited is created with m*n space
 * the entrance is either on the opp
 */

public class NearestExitInTheMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];

        //Since this is a shortest path , we will use the BFS
        //mark the entrance as visited
        visited[entrance[0]][entrance[1]] = true;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{entrance[0], entrance[1], 0});

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();

            int row = cur[0];
            int col = cur[1];
            int currentDistance = cur[2];

            int[][] neighbors = new int[][]{{row+1,col},{row,col+1},{row-1,col},{row,col-1}};

            for(int[] neighbor: neighbors) {
                int newRow = neighbor[0];
                int newCol = neighbor[1];

                //Has hit the block
                if(newRow < 0 || newCol < 0 || newRow == maze.length || newCol == maze[0].length || visited[newRow][newCol]
                        || maze[newRow][newCol] == '+'){
                    continue;
                }

                //Since this is the shortest distance, we need to return as soon we hit the entrance
                if(newRow == 0 || newRow == maze.length - 1 || newCol == 0 || newCol == maze[0].length - 1) {
                    return currentDistance+1; //add 1 to the distance to include the entrance
                }


                visited[newRow][newCol] = true;


                queue.offer(new int[]{newRow, newCol, currentDistance+1});
            }
        }

        return -1;
    }
}
