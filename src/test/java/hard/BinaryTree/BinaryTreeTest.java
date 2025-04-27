package hard.BinaryTree;

import hard.dp.BinaryTree.MaxPathSum;
import org.junit.Test;
import utils.TreeNode;

public class BinaryTreeTest {
    MaxPathSum maxPathSum = new MaxPathSum();

    @Test
    public void test() {
        TreeNode tree = new TreeNode(-10);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);

        assert maxPathSum.maxPathSum(tree) == 42;

        TreeNode tree2 = new TreeNode(-10);

        assert maxPathSum.maxPathSum(tree2) == -10;

        TreeNode tree3 = new TreeNode(2);
        tree3.left = new TreeNode(-1);

        assert maxPathSum.maxPathSum(tree3) == 2;
    }
}
