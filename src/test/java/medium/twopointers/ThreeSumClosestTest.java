package medium.twopointers;

import org.junit.Test;

public class ThreeSumClosestTest {
    ThreeSumClosest threeSumClosest = new ThreeSumClosest();

    @Test
    public void threeSumClosest() {
        assert threeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1) == 2;
    }
}
