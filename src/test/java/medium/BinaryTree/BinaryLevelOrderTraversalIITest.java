package medium.BinaryTree;

import org.junit.Test;
import utils.GeneralUtils;
import utils.TreeNode;

import static org.junit.Assert.assertEquals;

public class BinaryLevelOrderTraversalIITest {
    BinaryLevelOrderTraversalII bol = new BinaryLevelOrderTraversalII();

    @Test
    public void testBinaryLevelOrderTraversal() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9 );
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        assertEquals(GeneralUtils.convertToArrowSeperatedString(bol.levelOrderBottom(treeNode).stream()),"[15, 7]->[9, 20]->[3]");
    }
}
