package medium.mergeIntervals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Time Complexity o(nlogn + n) - Sort + points
 * Space Complexity o(logn)
 */

public class FindMinArrowsShot {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));

        int count = 1;
        int xEnd = points[0][1];
        for (int[] point : points) {
            if (xEnd < point[0]) {
                count++;
                xEnd = point[1];
            }

        }

        return count;

    }
}
