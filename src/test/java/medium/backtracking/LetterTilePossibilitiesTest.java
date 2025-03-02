package medium.backtracking;

import org.junit.Test;

public class LetterTilePossibilitiesTest {
    LetterTilePossibilities ltp = new LetterTilePossibilities();

    @Test
    public void test() {
        assert ltp.numTilePossibilities("AAB") == 8;
        assert ltp.numTilePossibilities("AB") == 4;
    }
}
