package medium.Trie;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordBreakTest {
    WordBreak wordBreak = new WordBreak();

    @Test
    public void test() {
        assertTrue(wordBreak.wordBreak("goalspecial", Arrays.asList("go", "goal", "goals", "special")));
        assertFalse(wordBreak.wordBreak("aaaaaaa", Arrays.asList("aaaa", "aa")));

        assertTrue(wordBreak.wordBreak("aaaaaaa", Arrays.asList("aaaa", "aaa")));

        assertFalse(wordBreak.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")));


        assertFalse(wordBreak.wordBreak("catsandog", Arrays.asList("cat", "cats",
                "and", "sand", "dog")));
        assertTrue(wordBreak.wordBreak("catsanddog", Arrays.asList("cat", "cats",
                "and", "sand", "dog")));
    }
}
