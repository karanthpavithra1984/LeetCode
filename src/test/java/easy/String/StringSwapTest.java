package easy.String;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringSwapTest {
    StringSwap swap = new StringSwap();

    @Test
    public void testSwap() {
        assertFalse(swap.areAlmostEqual("aa","bb"));
        assertFalse(swap.areAlmostEqual("aa", "ac"));
        assertFalse(swap.areAlmostEqual("appla","lppal"));
        assertTrue(swap.areAlmostEqual("kanb", "bank"));
        assertFalse(swap.areAlmostEqual("asserted", "defended"));
    }
}
