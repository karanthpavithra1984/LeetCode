package easy.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity o(n)
 *
 */

public class SumOfLeftLeaf {
    int total=0;
    public int sumOfLeftLeaves(TreeNode root) {
        sumOfLeftLeaves(root, false);
        return total;
    }

    private void sumOfLeftLeaves(TreeNode root, boolean isLeft) {
        if (root == null) return;

        if(isLeft && root.left == null && root.right == null) {
            total+=root.val;
        }

        sumOfLeftLeaves(root.left, true);
        sumOfLeftLeaves(root.right, false);
    }
}
