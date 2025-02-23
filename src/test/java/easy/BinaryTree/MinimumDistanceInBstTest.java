package easy.BinaryTree;

import medium.BinaryTree.MinimumDistanceInBsT;
import org.junit.Test;
import utils.TreeNode;

public class MinimumDistanceInBstTest {
    MinimumDistanceInBsT minimumDistanceInBst = new MinimumDistanceInBsT();

    @Test
    public void testMinimumDistanceInBst() {
        TreeNode root = new TreeNode(27);
        root.right = new TreeNode(34);
        root.right.right = new TreeNode(58);
        root.right.right.left = new TreeNode(50);
        root.right.right.left.left = new TreeNode(44);

        assert minimumDistanceInBst.minDiffInBST(root) == 6;

        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        assert minimumDistanceInBst.minDiffInBST(root) == 1;



    }
}
