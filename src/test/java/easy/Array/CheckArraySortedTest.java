package easy.Array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckArraySortedTest {
    CheckArraySorted checkArraySorted = new CheckArraySorted();

    @Test
    public void testCheckArraySorted() {
        assertTrue(checkArraySorted.check(new int[]{3,4,5,1,2}));
        assertFalse(checkArraySorted.check(new int[]{2,1,3,4}));
        assertTrue(checkArraySorted.check(new int[]{1,2,3}));
    }
}
