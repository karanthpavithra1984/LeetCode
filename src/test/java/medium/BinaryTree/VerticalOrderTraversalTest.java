package medium.BinaryTree;

import org.junit.Test;
import utils.GeneralUtils;
import utils.TreeNode;

import static org.junit.Assert.assertEquals;

public class VerticalOrderTraversalTest {
    VerticalOrderTraversal vor = new VerticalOrderTraversal();

    @Test
    public void test() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        assertEquals(GeneralUtils.convertToArrowSeperatedString(vor.verticalOrder(treeNode).stream()), "[9]->[3, 15]->[20]->[7]");
    }
}
