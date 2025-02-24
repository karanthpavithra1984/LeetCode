package medium.mergedIntervals;

import medium.mergeIntervals.IntervalIntersection;
import org.junit.Test;
import utils.GeneralUtils;

public class IntervalIntersectionTest {
    IntervalIntersection ii = new IntervalIntersection();

    @Test
    public void test1() {
        ii.intervalIntersection(new int[][]{{0,2},{5,10},{13,23},{24,25}},
        new int[][]{{1,5},{8,12},{15,24},{25,26}});
    }
}
