package medium.slidingWindow;

import org.junit.Test;

public class MaxConsecutiveOnesIITest {
    MaxConsecutiveOnesII m = new MaxConsecutiveOnesII();

    @Test
    public void testMaxConsecutiveOnesII() {
        assert  m.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}) == 4;
        assert  m.findMaxConsecutiveOnes(new int[]{1,0,1,1,0}) == 4;
    }
}
