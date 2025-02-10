package medium.backtracking;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class CombinationSumIIITest {
    CombinationSumIII combinationSumIII = new CombinationSumIII();

    @Test
    public void test() {
        assertEquals(GeneralUtils.convertToArrowSeperatedString(combinationSumIII.combinationSum3(9, 45).stream()), "[1, 2, 3, 4, 5, 6, 7, 8, 9]");
        assertEquals(GeneralUtils.convertToArrowSeperatedString(combinationSumIII.combinationSum3(4,1).stream()), "");
        assertEquals(GeneralUtils.convertToArrowSeperatedString(combinationSumIII.combinationSum3(3,9).stream()),"[1, 2, 6]->[1, 3, 5]->[2, 3, 4]");
        assertEquals(GeneralUtils.convertToArrowSeperatedString(
                combinationSumIII.combinationSum3(3,7).stream()), "[1, 2, 4]" );
    }
}
