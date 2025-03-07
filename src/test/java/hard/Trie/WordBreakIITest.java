package hard.Trie;

import org.junit.Test;

import java.util.Arrays;

public class WordBreakIITest {
    WordBreakII wb = new WordBreakII();

    @Test
    public void test() {
        wb.wordBreak("catsanddog",
                Arrays.asList("cat","cats","and","sand","dog"));
    }
}
