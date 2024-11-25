package medium.Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinRemoveToMakeValidTest {
    MinRemoveToMakeValid minRemoveToMakeValid = new MinRemoveToMakeValid();

    @Test
    public void testMinRemoveToMakeValid(){
//        assertEquals(minRemoveToMakeValid.minRemoveToMakeValid("lee(t(c)o)de)"), "lee(t(c)o)de");
//        assertEquals(minRemoveToMakeValid.minRemoveToMakeValid("a)b(c)d"), "ab(c)d");
        assertEquals(minRemoveToMakeValid.minRemoveToMakeValid("))(("), "");
    }
}
