package easy.SlidingWindow;

import org.junit.Test;

public class MinimumRecolorsTest {
    MinimumRecolors minimumRecolors = new MinimumRecolors();

    @Test
    public void testMinimumRecolors() {
        assert minimumRecolors.minimumRecolors("WWBBBWBBBBBWWBWWWB", 16) == 6;
        assert minimumRecolors.minimumRecolors("BWWWBB", 6) == 3;
        assert minimumRecolors.minimumRecolors("WBBWWBBWBW", 7) == 3;
        assert minimumRecolors.minimumRecolors("WBWBBBW", 2) == 0;
    }
}
