package medium.BinaryTree;

import org.junit.Test;
import utils.GeneralUtils;
import utils.TreeNode;

import static org.junit.Assert.assertEquals;

public class BinaryLevelZigZagOrderTest {
    BinaryLevelZigZagOrder bol = new BinaryLevelZigZagOrder();

    @Test
    public void testBinaryLevelOrderTraversal() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9 );
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        assertEquals(GeneralUtils.convertToArrowSeperatedString
                (bol.zigzagLevelOrder(treeNode).stream()),"[3]->[20, 9]->[15, 7]");
    }
}
