package medium.Array;

import java.util.Arrays;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        //Sort by Position
        Arrays.sort(pair, (a, b) -> b[0] - a[0]);

        double previousTime = 0.0;
        double currentTime = 0.0;
        int fleet = 0;

        for (int i = 0; i < pair.length; i++) {
            currentTime = (double) (target - pair[i][0]) / pair[i][1];
            if (previousTime == 0.0 || currentTime > previousTime) {
                //This will be fleet;
                fleet++;
                previousTime = currentTime;
            }
        }
        return fleet;
    }
}
