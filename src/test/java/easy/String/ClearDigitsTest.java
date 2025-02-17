package easy.String;

import easy.Stack.ClearDigits;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClearDigitsTest {
    ClearDigits c = new ClearDigits();

    @Test
    public void test() {
        assertEquals(c.clearDigits("abc"), "abc");
        assertEquals(c.clearDigits("cb34"), "");
    }
}
