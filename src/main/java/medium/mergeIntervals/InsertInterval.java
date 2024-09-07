package medium.mergeIntervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity - o(N)
 * Space Complexity - worst case o(n) , if we dont have any overlapping then we might have to add all the intervals with the new interval
 */

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergedInterval = new ArrayList<>();
        boolean olIntervalAdded = false;

        for (int[] interval : intervals) {
            // Non Overlapping
            if (interval[1] < newInterval[0]) {
                mergedInterval.add(interval);
            } else if (newInterval[1] >= interval[0]) {
                // Overlapping merged
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else {
                // Add the overlapping first if it reached here, to maintain the order
                if (!olIntervalAdded) {
                    mergedInterval.add(newInterval);
                    olIntervalAdded = true;
                }
                // After overlapping
                mergedInterval.add(interval);
            }
        }

        // Just in case the Overlapping interval not added
        if (!olIntervalAdded)
            mergedInterval.add(newInterval);

        return mergedInterval.toArray(new int[mergedInterval.size()][]);
    }
}
