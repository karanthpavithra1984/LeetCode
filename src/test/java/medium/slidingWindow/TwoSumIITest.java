package medium.slidingWindow;

import medium.twopointers.TwoSumII;
import org.junit.Test;
import utils.GeneralUtils;

public class TwoSumIITest {
    TwoSumII twoSumII = new TwoSumII();

    @Test
    public void twoSum() {
        GeneralUtils.compareValues(twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{1, 2});

    }
}
