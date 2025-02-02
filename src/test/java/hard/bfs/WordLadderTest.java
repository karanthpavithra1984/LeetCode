package hard.bfs;

import org.junit.Test;

import java.util.Arrays;

public class WordLadderTest {
    WordLadder wordLadder = new WordLadder();

    @Test
    public void testLadder() {
        assert wordLadder.
                ladderLength(  "hit",
                        "cog", Arrays.asList("hot","dot","dog","lot","log","cog")) == 5;

        assert wordLadder.
                ladderLength(  "hit",
                        "cog", Arrays.asList("hot","dot","dog","lot","log")) == 0;
    }
}
