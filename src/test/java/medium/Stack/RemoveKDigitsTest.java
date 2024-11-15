package medium.Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveKDigitsTest {
    RemoveKDigits removeKDigits = new RemoveKDigits();

    @Test
    public void testRemoveKDigits(){
        assertEquals(removeKDigits.removeKdigits("1432219", 3) , "1219");
        assertEquals(removeKDigits.removeKdigits("10200", 1), "200");
        assertEquals(removeKDigits.removeKdigits("10", 2), "0");
        assertEquals(removeKDigits.removeKdigits("9", 1), "0");
    }
}
