package easy.BinaryTree;

import utils.TreeNode;

public class MaximumDepth {
    /**
     * Worst case o(n), provided we are doing a comparison of unbalanced tree
     * Space complexity o(n) , since we are using recursion
     */

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return java.lang.Math.max(leftHeight, rightHeight) + 1;

    }
}
