package medium.binarySearch;

import medium.BinarySearch.LengthOfIncreasingSubSequence;
import org.junit.Test;

public class LengthOfIncreasingSubSequenceTest {
    LengthOfIncreasingSubSequence obj = new LengthOfIncreasingSubSequence();

    @Test
    public void lengthOfIncreasingSubSequence() {
        assert obj.lengthOfLIS(new int[]{10,9,1,2,5,6,3,9, 10}) == 6;
        assert obj.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}) == 4;
    }
}
