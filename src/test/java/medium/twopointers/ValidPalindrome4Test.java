package medium.twopointers;

import org.junit.Test;

public class ValidPalindrome4Test {

    ValidPalindrome4 validPalindrome4 = new ValidPalindrome4();

    @Test
    public void testValidPalindrome() {
       assert validPalindrome4.makePalindrome("abcdba");
       assert validPalindrome4.makePalindrome("aa");
       assert !validPalindrome4.makePalindrome("abcdef");
    }
}
