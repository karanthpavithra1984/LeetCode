package medium.binarySearch;

import medium.BinarySearch.MinimumNumberOfDays;
import org.junit.Test;

public class MinimumNumberOfDaysTest {
    MinimumNumberOfDays minimumNumberOfDays = new MinimumNumberOfDays();

    @Test
    public void test() {
        assert minimumNumberOfDays.minDays(new int[]{7, 7, 7, 7, 12, 7, 7}, 2, 3) == 12;
        assert minimumNumberOfDays.minDays(new int[]{1, 10, 3, 10, 2}, 3, 1) == 3;
        assert minimumNumberOfDays.minDays(new int[]{1, 10, 3, 10, 2}, 3, 2) == -1;

    }
}
