package medium.prefixSum;

import medium.prefixsum.ContinousSubArraySum;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ContinousSubArrayTest {
    ContinousSubArraySum continousSubArraySum = new ContinousSubArraySum();

    @Test
    public void testContinousSubArray(){
        //assertTrue(continousSubArraySum.checkSubarraySum(new int[]{23,2,4,6,7},  6));

        assertTrue(continousSubArraySum.checkSubarraySum(new int[]{23,2,4,6,6}, 7));
    }
}
