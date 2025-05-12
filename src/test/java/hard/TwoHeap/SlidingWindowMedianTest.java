package hard.TwoHeap;

import hard.twoHeap.SlidingWindowMedian;
import org.junit.Test;
import utils.GeneralUtils;

public class SlidingWindowMedianTest {

    @Test
    public void testMedian() {
        GeneralUtils.compareValues(new SlidingWindowMedian().medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3), new double[]{1.0, -1.0, -1.0, 3.0, 5.0, 6.0});
        GeneralUtils.compareValues(new SlidingWindowMedian().medianSlidingWindow(new int[]{1, 2, 3, 4, 2, 3, 1, 4, 2}, 3), new double[]{2.0, 3.0, 3.0, 3.0, 2.0, 3.0, 2.0});
    }
}
