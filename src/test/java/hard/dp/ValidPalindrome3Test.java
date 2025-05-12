package hard.dp;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindrome3Test {

    ValidPalindrome3 validPalindrome3 = new ValidPalindrome3();

    @Test
    public void isPalindrome() {
        assertTrue(validPalindrome3.isValidPalindrome("abcdeca", 2));
        assertTrue(validPalindrome3.isValidPalindrome("abbababa", 1));
        assertTrue(validPalindrome3.isValidPalindrome("baaaabaa", 3));
        assertFalse(validPalindrome3.isValidPalindrome("daabbddbdaadcabbccdddabaabadadadacaababdabdbaaccadadbbadaacbbbdd", 4));
    }
}
