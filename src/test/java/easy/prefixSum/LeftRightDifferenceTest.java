package easy.prefixSum;

import org.junit.Test;
import utils.GeneralUtils;

public class LeftRightDifferenceTest {
    LeftRightDifference leftRightDifference = new LeftRightDifference();

    @Test
    public void testLeftRightDifference() {
        GeneralUtils.compareValues(leftRightDifference.leftRightDifference(new int[]{10, 4, 8, 3}), new int[]{15, 1, 11, 22});
        GeneralUtils.compareValues(leftRightDifference.leftRightDifference(new int[]{1}), new int[]{0});
    }
}
