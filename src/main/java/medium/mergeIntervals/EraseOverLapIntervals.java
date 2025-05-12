package medium.mergeIntervals;

import java.util.Arrays;
import java.util.Comparator;

public class EraseOverLapIntervals {

    /**
     * sorting is nlogn + n
     *
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        //Sort them by second number
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int prevEnd = intervals[0][1];
        int remove = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (prevEnd > intervals[i][0]) {
                remove++;
            } else {
                prevEnd = intervals[i][1];
            }
        }
        return remove;
    }
}
