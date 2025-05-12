package medium.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoldWordsTest {
    BoldWords boldWords = new BoldWords();

    @Test
    public void testBoldWords() {
        assertEquals(boldWords.boldWords(new String[]{"ab", "bc"}, "aabcd"), "a<b>abc</b>d");
    }
}
