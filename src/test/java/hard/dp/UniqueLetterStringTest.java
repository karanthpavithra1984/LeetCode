package hard.dp;

import org.junit.Test;

public class UniqueLetterStringTest {
    UniqueLetterString uniqueLetterString = new UniqueLetterString();

    @Test
    public void uniqueLetterStringTest() {
        assert uniqueLetterString.uniqueLetterString("ABCB") == 16;
        assert uniqueLetterString.uniqueLetterString("ABC") == 10;

    }
}
