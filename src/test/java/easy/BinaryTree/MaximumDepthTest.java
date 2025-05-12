package easy.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.assertEquals;

public class MaximumDepthTest {
    MaximumDepth maximumDepth = new MaximumDepth();

    @Test
    public void maxDepth() {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);

        assertEquals(maximumDepth.maxDepth(tree), 3);
    }
}
