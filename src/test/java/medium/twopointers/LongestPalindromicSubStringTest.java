package medium.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubStringTest {
    LongestPalindromicSubString lsp = new LongestPalindromicSubString();

    @Test
    public void longestPalindrome() {
        assertEquals(lsp.longestPalindrome("babad"), "bab");
        assertEquals(lsp.longestPalindrome("aba"), "aba");
        assertEquals(lsp.longestPalindrome("cbbd"), "bb");
    }
}
