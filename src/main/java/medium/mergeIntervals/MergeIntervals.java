package medium.mergeIntervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Time Complexity o(nlogn + n ~ nlogn) - Sorting is nlogn and n is the interval
 * Space Complexity - Sorting takes logn space and linkedList which worse case if there is no merged interval is n
 * So its either logn or n
 */

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        LinkedList<int[]> mergedList = new LinkedList<>();

        for (int[] interval : intervals) {
            if (mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]) {
                mergedList.add(interval);
            } else {
                mergedList.getLast()[1] = Math.max(mergedList.getLast()[1], interval[1]);
            }
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
