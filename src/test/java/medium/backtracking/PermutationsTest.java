package medium.backtracking;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class PermutationsTest {
    Permutations p = new Permutations();

    @Test
    public void test() {
        assertEquals(
                GeneralUtils.convertToArrowSeperatedString(p.permute(new int[]{1, 2, 3}).stream()), "[1, 2, 3]->[1, 3, 2]->[2, 1, 3]->[2, 3, 1]->[3, 1, 2]->[3, 2, 1]");
    }
}
