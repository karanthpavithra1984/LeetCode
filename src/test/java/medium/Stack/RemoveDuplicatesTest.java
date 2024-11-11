package medium.Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void testRemoveDuplicates(){
       // assertEquals(removeDuplicates.removeDuplicateLetters("bcabcd"), "abcd");
        assertEquals(removeDuplicates.removeDuplicateLetters("cbacdcbc"), "acdb");
    }
}
