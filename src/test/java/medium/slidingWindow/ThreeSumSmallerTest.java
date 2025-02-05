package medium.slidingWindow;

import medium.twopointers.ThreeSumSmaller;
import org.junit.Test;

public class ThreeSumSmallerTest {
    ThreeSumSmaller t = new ThreeSumSmaller();

    @Test
    public void threeSumSmaller() {
        assert t.threeSumSmaller(new int[]{-2,0,1,3}, 2) == 2;
    }
}
