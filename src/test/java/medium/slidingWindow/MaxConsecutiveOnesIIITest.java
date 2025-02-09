package medium.slidingWindow;

import org.junit.Test;

public class MaxConsecutiveOnesIIITest {
    MaxConsecutiveOnesIII maxConsecutiveOnes = new MaxConsecutiveOnesIII();

    @Test
    public void testMaxConsecutiveOnesIII() {
        assert maxConsecutiveOnes.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0} , 2) == 6;
    }
}
