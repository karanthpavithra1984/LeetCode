package easy.BinaryTree;

import org.junit.Test;
import utils.GeneralUtils;
import utils.TreeNode;

import static org.junit.Assert.assertEquals;

public class BinaryTreePathTest {
    BinaryTreePath btp = new BinaryTreePath();

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);

        assertEquals(GeneralUtils.convertToCommaSeperatedString(btp.binaryTreePaths(root)), "1->2->5,1->3");

        assertEquals(GeneralUtils.convertToCommaSeperatedString(btp.binaryTreePaths(new TreeNode(1))), "1");
    }
}
