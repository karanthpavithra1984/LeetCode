package medium.twopointers;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {
    ThreeSum ts = new ThreeSum();

    @Test
    public void threeSum() {
        assertEquals(GeneralUtils.convertToArrowSeperatedString(ts.threeSum(new int[]{-2, 0, 0, 2, 2}).stream()), "[0, 2, -2]");
        assertEquals(GeneralUtils.
                convertToArrowSeperatedString(ts.threeSum(new int[]{-1, 0, 1, 2, -1, -4}).stream()), "[-1, 2, -1]->[0, 1, -1]");
        assertEquals(GeneralUtils.
                convertToArrowSeperatedString(ts.threeSum(new int[]{0, 1, 1}).stream()), "");
        assertEquals(GeneralUtils.
                convertToArrowSeperatedString(ts.threeSum(new int[]{0, 0, 0}).stream()), "[0, 0, 0]");
    }
}
