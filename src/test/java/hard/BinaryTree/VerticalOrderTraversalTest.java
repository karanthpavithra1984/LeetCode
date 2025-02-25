package hard.BinaryTree;

import org.junit.Test;
import utils.GeneralUtils;
import utils.TreeNode;

import static org.junit.Assert.assertEquals;

public class VerticalOrderTraversalTest {
    VerticalOrderTraversal vor = new VerticalOrderTraversal();

    @Test
    public void test() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertEquals(GeneralUtils.convertToArrowSeperatedString(vor.verticalTraversal(root).stream()),"[9]->[3, 15]->[20]->[7]");

    }
}
