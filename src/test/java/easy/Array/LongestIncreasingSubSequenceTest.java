package easy.Array;

import org.junit.Test;

public class LongestIncreasingSubSequenceTest {
    LongestIncreasingSubSequence longestIncreasingSubSequence = new LongestIncreasingSubSequence();

    @Test
    public void testLongestIncreasing() {
        assert longestIncreasingSubSequence.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}) == 3;
        assert longestIncreasingSubSequence.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}) == 1;
    }
}
