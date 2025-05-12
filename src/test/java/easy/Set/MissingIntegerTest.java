package easy.Set;

import org.junit.Test;

public class MissingIntegerTest {
    MissingInteger m = new MissingInteger();

    @Test
    public void test() {
        assert m.missingInteger(new int[]{1, 2, 3, 2, 5}) == 6;
    }
}
