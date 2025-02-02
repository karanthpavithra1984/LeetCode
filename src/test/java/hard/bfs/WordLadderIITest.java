package hard.bfs;

import org.junit.Test;

import java.util.Arrays;

public class WordLadderIITest {
    WordLadderII wordLadderII = new WordLadderII();

    @Test
    public void test() {
        wordLadderII.findLadders("hit",  "cog",
                Arrays.asList("hot","dot","dog","lot","log","cog"));
    }
}
