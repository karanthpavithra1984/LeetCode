package easy.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {
    ValidPalindrome validPalindrome= new ValidPalindrome();

    @Test
    public void testValidPalindrome(){
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(validPalindrome.isPalindrome("race a car"));
        assertFalse(validPalindrome.isPalindrome("0P"));
    }
}
