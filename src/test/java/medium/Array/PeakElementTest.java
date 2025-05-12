package medium.Array;

import org.junit.Test;

public class PeakElementTest {
    PeakElement peakElement = new PeakElement();

    @Test
    public void testPeakElement() {
        assert peakElement.findPeakElement(new int[]{1, 2, 3, 1}) == 2;
        assert peakElement.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}) == 5;
    }
}
