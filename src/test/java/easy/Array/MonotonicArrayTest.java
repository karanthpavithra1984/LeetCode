package easy.Array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class MonotonicArrayTest {
    MonoTonicArray monotonicArray = new MonoTonicArray();

    @Test
    public void monotonicArray() {
        assertFalse(monotonicArray.isMonotonic(new int[]{1, 3, 2}));
    }
}
