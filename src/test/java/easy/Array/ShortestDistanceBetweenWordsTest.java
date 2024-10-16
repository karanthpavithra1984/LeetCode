package easy.Array;

import org.junit.Test;

public class ShortestDistanceBetweenWordsTest {
    ShortestDistanceBetweenWords shortestDistanceBetweenWords = new ShortestDistanceBetweenWords();

    @Test
    public void testShortestDistanceBetweenWords(){
        assert shortestDistanceBetweenWords.shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},  "coding", "practice") == 3;
        assert shortestDistanceBetweenWords.shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},  "makes", "coding") == 1;
        assert shortestDistanceBetweenWords.shortestDistance(new String[]{"a","b","c","d","d"}, "a", "d") == 3;
    }
}
