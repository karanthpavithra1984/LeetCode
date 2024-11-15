package medium.Stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class isValidStringTest {
    isValidString isValidString = new isValidString();

    @Test
    public void testIsValidString(){
        assertTrue(isValidString.isValid("aabcbc"));
        assertTrue(isValidString.isValid("abcabcababcc"));
        assertFalse(isValidString.isValid("abccba"));
        assertFalse(isValidString.isValid("babcc"));

    }
}
