package easy.Stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BackSpaceStringCompareTest {
    BackSpaceStringCompare backSpaceStringCompare = new BackSpaceStringCompare();

    @Test
    public void testBackSpace() {
        assertTrue(backSpaceStringCompare.backspaceCompare("ab#c", "ad#c"));
        assertTrue(backSpaceStringCompare.backspaceCompare("ab##", "c#d#"));
        assertFalse(backSpaceStringCompare.backspaceCompare("a#c", "b"));
    }
}
