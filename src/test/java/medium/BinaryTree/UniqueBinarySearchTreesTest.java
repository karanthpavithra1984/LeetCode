package medium.BinaryTree;

import org.junit.Test;

public class UniqueBinarySearchTreesTest {
    UniqueBinarySearchTrees bst = new UniqueBinarySearchTrees();

    @Test
    public void uniqueBinarySearchTrees() {
        assert bst.numTrees(1) == 1;
        assert bst.numTrees(2) == 2;
        assert bst.numTrees(3) == 5;
        assert bst.numTrees(4) == 14;
        assert bst.numTrees(5) == 42;
        assert bst.numTrees(6) == 132;
    }
}
