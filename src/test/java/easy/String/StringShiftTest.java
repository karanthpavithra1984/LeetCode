package easy.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringShiftTest {
    StringShift stringShift = new StringShift();

    @Test
    public void testShift() {
        assertEquals(stringShift.stringShift("yisxjwry", new int[][]{{1, 8}, {1, 4}, {1, 3}, {1, 6}, {0, 6}, {1, 4}, {0, 2}, {0, 1}}), "yisxjwry");
        assertEquals(stringShift.stringShift("mecsk", new int[][]{{1, 4}, {0, 5}, {0, 4}, {1, 1}, {1, 5}}), "kmecs");
        assertEquals(stringShift.stringShift("abc", new int[][]{{0, 1}, {1, 2}}), "cab");
        assertEquals(stringShift.stringShift("abcdefg", new int[][]{{1, 1}, {1, 1}, {0, 2}, {1, 3}}), "efgabcd");
        assertEquals(stringShift.stringShift("abcdefg", new int[][]{{1, 1}, {1, 1}, {0, 2}}), "abcdefg");
        assertEquals(stringShift.stringShift("abcdefg", new int[][]{{0, 1}, {0, 1}}), "cdefgab");
    }
}
