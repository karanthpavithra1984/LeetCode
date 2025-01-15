package medium.BinaryTree;

import org.junit.Test;
import utils.BinaryTreeUtils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class isValidBSTTest {
    isValidBST isValidBST = new isValidBST();

    @Test
    public void isValidBST() {
        assertTrue(isValidBST.isValidBST(BinaryTreeUtils.getTreeNode()));
        assertFalse(isValidBST.isValidBST(BinaryTreeUtils.getInvalidTreeNode()));
    }
}
