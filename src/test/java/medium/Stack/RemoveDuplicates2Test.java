package medium.Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicates2Test {
    RemoveDuplicates2 removeDuplicates2 = new RemoveDuplicates2();

    @Test
    public void testRemoveDuplicates(){
        assertEquals(removeDuplicates2.removeDuplicates("deeedbbcccbdaa", 3) , "aa");
        assertEquals(removeDuplicates2.removeDuplicates("abcd", 2) , "abcd");
        assertEquals(removeDuplicates2.removeDuplicates("pbbcggttciiippooaais", 2), "ps");
        assertEquals(removeDuplicates2.removeDuplicates("yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy", 4), "ybth");
    }
}
