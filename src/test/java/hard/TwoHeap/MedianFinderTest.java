package hard.TwoHeap;

import hard.twoHeap.MedianFinder;
import org.junit.Test;

public class MedianFinderTest {
    MedianFinder mf = new MedianFinder();

    @Test
    public void testMedianFinder() {
        mf.addNum(2);
        assert mf.findMedian() == 2.0;
        mf.addNum(3);
        assert mf.findMedian() == 2.5;
        mf.addNum(4);
        assert mf.findMedian() == 3.0;
    }
}
