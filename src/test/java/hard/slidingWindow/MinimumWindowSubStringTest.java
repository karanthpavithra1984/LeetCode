package hard.slidingWindow;

import hard.SlidingWindow.MinimumWindowSubString;
import org.junit.Test;

public class MinimumWindowSubStringTest {
    MinimumWindowSubString minimumWindowSubString = new MinimumWindowSubString();

    @Test
    public void testMinimumWindowSubstring(){
        minimumWindowSubString.minWindow("ADOBECODEBANC","ABC");
    }
}
