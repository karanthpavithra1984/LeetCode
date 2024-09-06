package medium.mergedIntervals;

import medium.mergeIntervals.MergeIntervals;
import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class MergedIntervalsTest {

    MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    public void testMergedIntervals() {
        assertEquals(GeneralUtils.convertToCommaSeperatedString(mergeIntervals.merge(new int[][]{{1,4},{4,5}})), "1->5");
        assertEquals(GeneralUtils.convertToCommaSeperatedString(mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})), "1->6,8->10,15->18");
    }
}
