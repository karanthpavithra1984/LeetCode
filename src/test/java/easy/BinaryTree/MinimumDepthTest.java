package easy.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.assertEquals;

public class MinimumDepthTest {
    MinimumDepth minimumDepth = new MinimumDepth();

    @Test
    public void minDepth() {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);

        assertEquals(minimumDepth.minDepth(tree), 2);
    }
}
