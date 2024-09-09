package medium.mergedIntervals;

import medium.mergeIntervals.FindMinArrowsShot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinArrowsShotTest {
    FindMinArrowsShot findMinArrowsShot = new FindMinArrowsShot();

    @Test
    public void testFindMinArrowsShot(){
        assertEquals(findMinArrowsShot.findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}), 2);
        assertEquals(findMinArrowsShot.findMinArrowShots(new int[][]{{1,2},{2,3},{3,4},{4,5}}), 2);
        assertEquals(findMinArrowsShot.findMinArrowShots(new int[][]{{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}}), 2);
    }
}
