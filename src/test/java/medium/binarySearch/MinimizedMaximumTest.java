package medium.binarySearch;

import medium.BinarySearch.MinimizedMaximum;
import org.junit.Test;

public class MinimizedMaximumTest {
    MinimizedMaximum minimizedMaximum = new MinimizedMaximum();

    @Test
    public void test() {
        minimizedMaximum.minimizedMaximum(7, new int[]{10,10,15});
        minimizedMaximum.minimizedMaximum(6, new int[]{11,6});
    }
}
