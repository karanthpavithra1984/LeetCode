package medium.Array;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class FindDuplicatesTest {
    FindDuplicates findDuplicates = new FindDuplicates();

    @Test
    public void testFindDuplicates() {
        assertEquals(GeneralUtils.convertToCommaSeperatedString(findDuplicates.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1})), "2,3");
        assertEquals(GeneralUtils.convertToCommaSeperatedString(findDuplicates.findDuplicates(new int[]{10, 2, 5, 10, 9, 1, 1, 4, 3, 7})), "10,1");
    }
}
