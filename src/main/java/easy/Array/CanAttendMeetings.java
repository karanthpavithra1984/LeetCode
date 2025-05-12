package easy.Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sorting o(nlogn) - time complexity
 * Space Complexity - o(1)
 */
public class CanAttendMeetings {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        for (int i = 0; i < intervals.length - 1; i++) {
            //The second value in the current interval is greater than the first value of next interval,
            //There is a overlap , hence cant attend
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false;
            }
        }

        return true;
    }
}
