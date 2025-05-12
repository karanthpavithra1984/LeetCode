package easy.prefixSum;

import org.junit.Test;
import utils.GeneralUtils;

public class RunningSumOf1DArrayTest {
    RunningSumOf1DArray runningSumOf1DArray = new RunningSumOf1DArray();

    @Test
    public void testRunningSumOf1DArray() {
        GeneralUtils.compareValues(runningSumOf1DArray.runningSum(new int[]{1, 2, 3, 4}), new int[]{1, 3, 6, 10});
    }
}
