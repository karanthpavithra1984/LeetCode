package easy.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class isSameTreeTest {
    isSameTree isSameTree = new isSameTree();
    @Test
    public void isSameTreeTest() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        assertTrue(isSameTree.isSameTree(root, root));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);

        TreeNode root3 = new TreeNode(1);
        root3.right = new TreeNode(3);

        assertFalse(isSameTree.isSameTree(root2, root3));
    }
}
