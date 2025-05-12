package easy.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity o(n)
 * Space Complexity ArrayList - o(n) + Recursion takes up the space - if its balanced , o(logn), if its unbalanced o(n) -
 * So total o(2n)
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftHeight = root.left == null ? 0 : checkHeight(root.left);
        int rightHeight = root.right == null ? 0 : checkHeight(root.right);
        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int checkHeight(TreeNode root) {
        if (root == null) return 0;

        int left = checkHeight(root.left);
        int right = checkHeight(root.right);
        return Math.max(left, right) + 1;
    }
}
