package medium.unionfind;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidTreeTest {
    ValidTree validTree = new ValidTree();

    @Test
    public void testValidTree() {
        assertTrue(validTree.validTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}}));
        assertFalse(validTree.validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}}));
        assertFalse(validTree.validTree(4, new int[][]{{0, 1}, {2, 3}}));
        assertTrue(validTree.validTree(4, new int[][]{{0, 1}, {2, 3}, {1, 2}}));
    }
}
