package medium.binarySearch;

import medium.BinarySearch.MaximumCandies;
import org.junit.Test;

public class MaximumCandiesTest {
    MaximumCandies ma = new MaximumCandies();

    @Test
    public void test() {
        assert ma.maximumCandies(new int[]{2,5}, 11) == 0;
        assert ma.maximumCandies(new int[]{4,7,5}, 16) == 1;
        assert ma.maximumCandies(new int[]{5,8,6}, 3) == 5;

    }
}
