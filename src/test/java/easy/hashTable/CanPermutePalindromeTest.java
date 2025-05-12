package easy.hashTable;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanPermutePalindromeTest {
    CanPermutatePalindrome canPermutatePalindrome = new CanPermutatePalindrome();

    @Test
    public void testCanPermutatePalindrome() {
        assertTrue(canPermutatePalindrome.canPermutePalindrome("carerac"));
        assertTrue(canPermutatePalindrome.canPermutePalindrome("aab"));
        assertFalse(canPermutatePalindrome.canPermutePalindrome("code"));
    }
}
