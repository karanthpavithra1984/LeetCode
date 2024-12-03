package easy.BinarySearch;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class isSymmetricTest {
    isSymmetric isSymmetric = new isSymmetric();

    @Test
    public void isSymmetricTest() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);

        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(3);

        assertTrue(isSymmetric.isSymmetric(treeNode));

        treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(3);

        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);

        assertFalse(isSymmetric.isSymmetric(treeNode));
    }
}
