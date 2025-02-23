package easy.Array;

import org.junit.Test;

public class LongestMonotonicSubArrayTest {
    LongestMonotonicSubArray longestMonotonicSubArray = new LongestMonotonicSubArray();

    @Test
    public void longestMonotonicSubArray() {
        assert longestMonotonicSubArray.longestMonotonicSubarray(new int[]{1,4,3,3,2}) == 2;
    }
}
