package easy.Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveAdjacentDuplicatesTest {
    RemoveAdjacentDuplicates removeAdjacentDuplicates = new RemoveAdjacentDuplicates();

    @Test
    public void testRemoveAdjacentDuplicates() {
        assertEquals(removeAdjacentDuplicates.removeDuplicates("abbaca"), "ca");
        assertEquals(removeAdjacentDuplicates.removeDuplicates("azxxzy"), "ay");
    }
}
