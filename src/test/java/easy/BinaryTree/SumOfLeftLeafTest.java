package easy.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

public class SumOfLeftLeafTest {
    SumOfLeftLeaf sol = new SumOfLeftLeaf();

    @Test
    public void testSumofLeftLeaf() {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);

        assert sol.sumOfLeftLeaves(tree) == 24;

    }
}
