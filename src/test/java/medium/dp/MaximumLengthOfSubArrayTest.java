package medium.dp;

import org.junit.Test;

public class MaximumLengthOfSubArrayTest {
    MaximumLengthOfSubArray solution = new MaximumLengthOfSubArray();

    @Test
    public void test() {
        assert solution.getMaxLen(new int[]{1, -2, -3, 4}) == 4;
    }
}
