package medium.backtracking;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetHappyStringTest {
    GetHappyString getHappyString = new GetHappyString();

    @Test
    public void test() {
        assertEquals(getHappyString.getHappyString(3, 9), "cab");
        assertEquals(getHappyString.getHappyString(1, 3), "c");
    }
}
