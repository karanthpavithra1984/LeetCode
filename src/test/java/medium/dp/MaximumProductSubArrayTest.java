package medium.dp;

import org.junit.Test;

public class MaximumProductSubArrayTest {
    MaximumProductSubArray m = new MaximumProductSubArray();

    @Test
    public void test() {
        assert m.maxProduct(new int[]{2, 3, -2, 4}) == 6;
    }
}
