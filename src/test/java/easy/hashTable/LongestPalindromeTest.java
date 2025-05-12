package easy.hashTable;

import org.junit.Test;

public class LongestPalindromeTest {
    LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    public void testLongestPalindrome() {
        assert longestPalindrome.longestPalindrome("abba") == 4;
        assert longestPalindrome.longestPalindrome("abccccdd") == 7;
        assert longestPalindrome.longestPalindrome("a") == 1;
    }
}
