package medium.prefixSum;

import medium.prefixsum.SumOfDistances;
import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class SumOfDistancesTest {
    SumOfDistances sumOfDistances = new SumOfDistances();

    @Test
    public void testSumOfDistances(){
       GeneralUtils.compareValues(sumOfDistances.distance(new int[]{1,3,1,1,2,1}), new long[]{10,0,6,6,0,10});
        GeneralUtils.compareValues(sumOfDistances.distance(new int[]{4,1,3,1,1,2,1}), new long[]{0,10,0,6,6,0,10});
    }
}
