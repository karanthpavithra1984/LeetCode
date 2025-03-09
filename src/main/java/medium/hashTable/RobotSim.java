package medium.hashTable;

import java.util.HashSet;
import java.util.Set;

public class RobotSim {
    public int robotSim(int[] commands, int[][] obstacles) {

        //Define directions i.e N,E,S,W
        int[][] directions = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};

        //The reason why we cant use Map is because its possible that keys could be same
        //i.E x coordinates could be same
        //Time Complexotu is o(n)
        Set<String> obstacleSet = new HashSet<>(obstacles.length);
        for(int[] obstacle: obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        //The commands other than directions are always going to be positive
        //Hence if not directed will move north
        int currentDirection = 0;
        //Where it all starts
        int[] currentPosition = {0,0};
        int maxDistance = 0;

        //Time Compleixyt o(m)
        //Now loop through the commands
        for(int command: commands) {
            if(command == -1){
                //Right this is east if you begin from the beginning
                //Calcualte with respect to directions
                //East is second direction i.e direction[1]
                currentDirection = (currentDirection + 1) % 4;
            }

            if(command == -2){
                //This is West if you begin from the beginning
                //West is last direction i.e direction[3];
                currentDirection = (currentDirection + 3) % 4;
            }

            for(int step = 0; step < command; step++) {
              int newX = currentPosition[0] + directions[currentDirection][0];
              int newY = currentPosition[1] + directions[currentDirection][1];

              if(obstacleSet.contains(newX + "," + newY)){
                  break;
              }

              currentPosition[0] = newX;
              currentPosition[1] = newY;
            }

            maxDistance = Math.max(maxDistance, currentPosition[0]*currentPosition[0] + currentPosition[1]*currentPosition[1]);
        }
        return maxDistance;
    }

}
