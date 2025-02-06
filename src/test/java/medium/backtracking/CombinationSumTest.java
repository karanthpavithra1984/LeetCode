package medium.backtracking;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class CombinationSumTest {
    CombinationSum combinationSum = new CombinationSum();

    @Test
    public void testCombinationSum() {
      assertEquals(
              GeneralUtils.convertToArrowSeperatedString(combinationSum.combinationSum(new int[]{2,3,6,7}, 7).stream()),
              "[2, 2, 3]->[7]");
    }
}
