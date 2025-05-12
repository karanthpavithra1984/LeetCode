package medium.Stack;

import org.junit.Test;

public class MinimumAdditionTest {
    MinimumAddition minimumAddition = new MinimumAddition();

    @Test
    public void testMinimumAddition() {
        assert minimumAddition.addMinimum("b") == 2;
        assert minimumAddition.addMinimum("aaa") == 6;
        assert minimumAddition.addMinimum("abc") == 0;
        assert minimumAddition.addMinimum("aaaabb") == 9;
        assert minimumAddition.addMinimum("aaaaac") == 9;
    }
}
