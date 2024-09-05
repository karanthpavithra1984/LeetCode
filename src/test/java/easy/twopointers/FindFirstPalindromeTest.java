package easy.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindFirstPalindromeTest {

    FindFirstPalindrome fixture = new FindFirstPalindrome();

    @Test
    public void test() {
        assertEquals(fixture.firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}), "ada");
        assertEquals(fixture.firstPalindrome(new String[]{"notapalindrome","racecar"}), "racecar");
        assertEquals(fixture.firstPalindrome(new String[]{"def","ghi"}),"");
    }
}
