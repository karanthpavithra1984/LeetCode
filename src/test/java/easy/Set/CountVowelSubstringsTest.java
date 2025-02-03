package easy.Set;

import org.junit.Test;

public class CountVowelSubstringsTest {
    CountVowelSubstrings countVowelSubstrings = new CountVowelSubstrings();

    @Test
    public void countVowelSubstrings() {
        assert countVowelSubstrings.countVowelSubstrings("cuaieuouac") ==7;
        assert countVowelSubstrings.countVowelSubstrings("aeiouu") ==2;

    }
}
