package easy.BinaryTree;

import org.junit.Test;
import utils.BinaryTreeUtils;

import static org.junit.Assert.assertEquals;

public class InOrderTraversalTest {
    InOrderTraversal inOrderTraversal = new InOrderTraversal();

    @Test
    public void testInorderTraversal() {
        assertEquals(BinaryTreeUtils.commaSeperatedString(inOrderTraversal.inorderTraversal(BinaryTreeUtils.getTreeNode())), "1,2,3,4,5,6,7,8,9");
    }
}