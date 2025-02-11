package medium.backtracking;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class LetterCombinationsTest {
    LetterCombinations   letterCombinations = new LetterCombinations();

    @Test
    public void test() {
        assertEquals(GeneralUtils.convertToCommaSeperatedString(
                letterCombinations.letterCombinations("23")),"ad,ae,af,bd,be,bf,cd,ce,cf");
    }
}
