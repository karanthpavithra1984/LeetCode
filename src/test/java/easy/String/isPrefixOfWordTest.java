package easy.String;

import org.junit.Test;

public class isPrefixOfWordTest {
    isPrefixOfWord isPrefixOfWord = new isPrefixOfWord();

    @Test
    public void testIsPrefixOfWord(){
        assert isPrefixOfWord.isPrefixOfWord("i love eating burger", "burg") == 4;
        assert isPrefixOfWord.isPrefixOfWord("this problem is an easy problem", "pro") == 2;
        assert isPrefixOfWord.isPrefixOfWord("i am tired", "you") == -1;
    }
}
