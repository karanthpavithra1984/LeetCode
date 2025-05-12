package medium.Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveStackTest {
    RemoveStar removeStar = new RemoveStar();

    @Test
    public void testRemoveStar() {
        assertEquals(removeStar.removeStars("leet**cod*e"), "lecoe");
    }
}
