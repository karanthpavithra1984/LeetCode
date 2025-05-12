package easy.Array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class isCoveredTest {
    isCovered isCovered = new isCovered();

    @Test
    public void testIsCovered() {
        assertTrue(isCovered.isCovered(new int[][]{{1, 10}, {10, 21}}, 21, 21));
        assertTrue(isCovered.isCovered(new int[][]{{1, 2}, {3, 4}, {5, 6}}, 2, 5));
        assertFalse(isCovered.isCovered(new int[][]{{1, 10}, {10, 20}}, 21, 21));
        assertFalse(isCovered.isCovered(new int[][]{{50, 50}}, 1, 50));
    }
}
