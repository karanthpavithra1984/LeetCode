package easy.BinaryTree;

import utils.TreeNode;

public class isSymmetric {
    /**
     * We basically have to check if the left side of the tree is same as the right side of the tree
     */

    /**
     * Worst case o(n), provided we are doing a comparison of unbalanced tree
     * Space complexity o(n) , since we are using recursion
     */

    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root, root);
    }

    private boolean isSameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;

        return isSameTree(root1.left, root2.right) && isSameTree(root1.right, root2.left);
    }
}
