package easy.BinaryTree;

import org.junit.Test;
import utils.BinaryTreeUtils;

import static org.junit.Assert.assertEquals;

public class PreOrderTraversalTest {
    PreOrderTraversal preOrderTraversal = new PreOrderTraversal();

    @Test
    public void testPreorderTraversal() {
        assertEquals(BinaryTreeUtils.commaSeperatedString(preOrderTraversal.preorderTraversal(BinaryTreeUtils.getTreeNode())), "5,3,2,1,4,8,7,6,9");
    }
}