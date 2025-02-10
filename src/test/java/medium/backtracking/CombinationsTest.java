package medium.backtracking;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class CombinationsTest {
    Combinations combinations = new Combinations();
    CombinationsNonOptimized combinationsNonOptimized = new CombinationsNonOptimized();

    @Test
    public void test() {
        //new CombinationsLeetCode().combine(7,2);
        new Combinations().combine(7,2);
        //new CombinationsNonOptimized().combine(7,2);

        assertEquals(GeneralUtils.
                convertToArrowSeperatedString(
                        new CombinationsNonOptimized().combine(4, 2).stream()), "[1, 2]->[1, 3]->[1, 4]->[2, 3]->[2, 4]->[3, 4]");

        assertEquals(GeneralUtils.
                convertToArrowSeperatedString(
                        new Combinations().combine(4, 2).stream()), "[1, 2]->[1, 3]->[1, 4]->[2, 3]->[2, 4]->[3, 4]");

        assertEquals(GeneralUtils.
                        convertToArrowSeperatedString(
                                combinationsNonOptimized.combine(5, 2).stream()),
                "[1, 2]->[1, 3]->[1, 4]->[1, 5]->[2, 3]->[2, 4]->[2, 5]->[3, 4]->[3, 5]->[4, 5]");

        assertEquals(GeneralUtils.
                        convertToArrowSeperatedString(
                                new Combinations().combine(5, 2).stream()),
                "[1, 2]->[1, 3]->[1, 4]->[1, 5]->[2, 3]->[2, 4]->[2, 5]->[3, 4]->[3, 5]->[4, 5]");
    }
}
