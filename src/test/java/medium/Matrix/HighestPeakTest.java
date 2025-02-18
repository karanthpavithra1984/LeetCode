package medium.Matrix;

import org.junit.Test;

public class HighestPeakTest {
    HighestPeak hp = new HighestPeak();

    @Test
    public void highestPeak() {
        hp.highestPeak(new int[][]{{0,1},{0,0}});
        hp.highestPeak(new int[][]{{0,0,1},{1,0,0},{0,0,0}});
    }
}
