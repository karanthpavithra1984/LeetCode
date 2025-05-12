package easy.Math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddStringsTest {
    AddStrings addStrings = new AddStrings();

    @Test
    public void test() {
        assertEquals(addStrings.addStrings("11", "123"), "134");
        assertEquals(addStrings.addStrings("456", "77"), "533");
        assertEquals(addStrings.addStrings("99", "1"), "100");
        assertEquals(addStrings.addStrings("0", "0"), "0");
    }
}
