package easy.SlidingWindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlidingWindowTest {
    SlidingWindow slidingWindow = new SlidingWindow();

    @Test
    public void test() {
        assertEquals(slidingWindow.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 12.75, 0);
        assertEquals(slidingWindow.findMaxAverage(new int[]{5}, 1), 5, 0);
        assertEquals(slidingWindow.findMaxAverage(new int[]{9, 7, 3, 5, 6, 2, 0, 8, 1, 9}, 6), 5.333333333333333, 0);
    }
}
