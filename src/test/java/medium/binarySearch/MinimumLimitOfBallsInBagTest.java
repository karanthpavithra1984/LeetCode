package medium.binarySearch;

import medium.BinarySearch.MinimumLimitOfBallsInABag;
import org.junit.Test;

public class MinimumLimitOfBallsInBagTest {
    MinimumLimitOfBallsInABag minimumLimitOfBallsInABag = new MinimumLimitOfBallsInABag();

    @Test
    public void test() {
        assert minimumLimitOfBallsInABag.minimumSize(new int[]{9}, 2) == 3;
        assert minimumLimitOfBallsInABag.minimumSize(new int[]{2, 4, 8, 2}, 4) == 2;
    }
}
