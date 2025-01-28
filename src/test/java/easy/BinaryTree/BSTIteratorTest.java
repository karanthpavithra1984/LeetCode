package easy.BinaryTree;

import com.sun.source.tree.BinaryTree;
import medium.BinaryTree.BSTIterator;
import org.junit.Test;
import utils.BinaryTreeUtils;

public class BSTIteratorTest {
    BSTIterator bstIterator;

    @Test
    public void testBSTIterator() {
        bstIterator = new BSTIterator(BinaryTreeUtils.getTreeNode());
        assert bstIterator.next() ==    1;
    }
}
