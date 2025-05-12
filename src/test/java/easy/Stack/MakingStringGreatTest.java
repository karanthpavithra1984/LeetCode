package easy.Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakingStringGreatTest {
    MakeStringGreat makeStringGreat = new MakeStringGreat();

    @Test
    public void testMakingStringGreat() {
        assertEquals(makeStringGreat.makeGood("leEeetcode"), "leetcode");
        assertEquals(makeStringGreat.makeGood("abBAcC"), "");
        assertEquals(makeStringGreat.makeGood("s"), "s");
    }
}
