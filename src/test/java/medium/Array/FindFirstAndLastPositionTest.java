package medium.Array;

import org.junit.Test;
import utils.GeneralUtils;

public class FindFirstAndLastPositionTest {
    FindFirstAndLastPosition findFirstAndLastPosition = new FindFirstAndLastPosition();

    @Test
    public void testFindFirstAndLast() {
        GeneralUtils.compareValues(findFirstAndLastPosition.searchRange(new int[]{5, 6, 7, 8, 8, 10}, 8), new int[]{3, 4});
        GeneralUtils.compareValues(findFirstAndLastPosition.searchRange(new int[]{5, 6, 7, 8, 8, 8, 8, 8, 10}, 8), new int[]{3, 7});
        GeneralUtils.compareValues(findFirstAndLastPosition.searchRange(new int[]{5, 6, 7, 8, 8, 8, 8, 8, 10}, 9), new int[]{-1, -1});
        GeneralUtils.compareValues(findFirstAndLastPosition.searchRange(new int[]{1}, 1), new int[]{0, 0});
    }
}
