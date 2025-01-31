package easy.String;

import medium.String.OneEditString;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class OneEditStringTest {
    OneEditString oneEditString = new OneEditString();

    @Test
    public void testOneEditString() {
        assertTrue(oneEditString.isOneEditDistance("a", ""));
        assertTrue(oneEditString.isOneEditDistance("acb", "adb"));

    }
}
