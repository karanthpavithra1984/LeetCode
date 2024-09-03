package easy.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindrome2Test {
    @Test
    public void ValidPalindrome2() {
        ValidPalindrome2 validPalindrome2 = new ValidPalindrome2();
        assertTrue(validPalindrome2.validPalindrome("aba"));
        assertTrue(validPalindrome2.validPalindrome("abca"));
        assertFalse(validPalindrome2.validPalindrome("abc"));
        assertTrue(validPalindrome2.validPalindrome("eccer"));
    }
}
