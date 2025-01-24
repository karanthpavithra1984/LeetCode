package easy.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseVowelsTest {
    ReverseVowels rev = new ReverseVowels();

    @Test
    public void testReverseVowels() {
       assertEquals(rev.reverseVowels("IceCreAm"), "AceCreIm");
       assertEquals(rev.reverseVowels("aA"), "Aa");
       assertEquals(rev.reverseVowels("leetcode"), "leotcede");
       assertEquals(rev.reverseVowels("Euston saw I was not Sue."), "euston saw I was not SuE.");
    }
}
