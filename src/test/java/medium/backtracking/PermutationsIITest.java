package medium.backtracking;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class PermutationsIITest {
    PermutationsII p = new PermutationsII();

    @Test
    public void test() {
        assertEquals(
                GeneralUtils.convertToArrowSeperatedString(
                        p.permuteUnique(new int[]{1, 1, 2}).stream()), "[1, 1, 2]->[1, 2, 1]->[2, 1, 1]");
    }
}
