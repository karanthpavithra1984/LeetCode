package medium.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomSortStringTest {
    CustomSortString cs = new CustomSortString();

    @Test
    public void test() {
        assertEquals(cs.customSortString("cba","abcd"),"cbad");
        assertEquals(cs.customSortString("kqep","pekeq"),"kqeep");
    }
}
