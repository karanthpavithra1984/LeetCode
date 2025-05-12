package medium.prefixSum;

import medium.prefixsum.SubArraySum;
import org.junit.Test;

public class SubArraySumTest {
    SubArraySum subArraySum = new SubArraySum();

    @Test
    public void testSubArraySum() {
        assert subArraySum.subarraySum(new int[]{1, 1, 1}, 2) == 2;
    }
}
