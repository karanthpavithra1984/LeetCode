package medium.backtracking;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class CombinationSumIITest {
    CombinationSumII cs = new CombinationSumII();

    @Test
    public void test() {
        assertEquals(GeneralUtils.convertToArrowSeperatedString(
                cs.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8).stream()
        ), "[1, 1, 6]->[1, 2, 5]->[1, 7]->[2, 6]");
    }
}
