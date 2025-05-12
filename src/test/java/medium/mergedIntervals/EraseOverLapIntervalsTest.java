package medium.mergedIntervals;

import medium.mergeIntervals.EraseOverLapIntervals;
import org.junit.Test;

public class EraseOverLapIntervalsTest {
    EraseOverLapIntervals eraseOverLapIntervals = new EraseOverLapIntervals();

    @Test
    public void test() {
        eraseOverLapIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}});
    }
}
