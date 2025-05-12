package medium.mergedIntervals;

import medium.mergeIntervals.InsertInterval;
import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class InsertIntervalTest {

    InsertInterval insertInterval = new InsertInterval();

    @Test
    public void testInsertInterval() {
        assertEquals(GeneralUtils.convertToCommaSeperatedString(insertInterval.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})), "1->5,6->9");
        assertEquals(GeneralUtils.convertToCommaSeperatedString(
                insertInterval.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8})), "1->2,3->10,12->16");
        assertEquals(GeneralUtils.convertToCommaSeperatedString(insertInterval.insert(new int[][]{{2, 5}, {6, 7}, {8, 9}}, new int[]{0, 1})), "0->1,2->5,6->7,8->9");
    }
}
