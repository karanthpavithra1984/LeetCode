package easy.BinaryTree;

import org.junit.Test;
import utils.BinaryTreeUtils;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class BinarySearchPostOrderTraversalTest {
    BinarySearchPostOrderTraversal bst = new BinarySearchPostOrderTraversal();

    @Test
    public void test() {
        BinarySearchPostOrderTraversal bst = new BinarySearchPostOrderTraversal();
        assertEquals(GeneralUtils.convertToCommaSeperatedString(bst.postorderTraversal(BinaryTreeUtils.getTreeNode())),"1,2,4,3,6,7,9,8,5");
    }
}
