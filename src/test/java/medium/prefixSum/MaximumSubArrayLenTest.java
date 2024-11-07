package medium.prefixSum;

import medium.prefixsum.MaximumSubarrayLen;
import org.junit.Test;

public class MaximumSubArrayLenTest {
    MaximumSubarrayLen maximumSubarrayLen = new MaximumSubarrayLen();

    @Test
    public void testMaximumSubArrayLenTest(){
        assert maximumSubarrayLen.maxSubArrayLen(new int[]{1,-1,5,-2,3}, 3) == 4;
        assert maximumSubarrayLen.maxSubArrayLen(new int[]{-2,-1,2,1}, 1) == 2;
        assert maximumSubarrayLen.maxSubArrayLen(new int[]{1,0,-1}, -1) == 2;
    }
}
