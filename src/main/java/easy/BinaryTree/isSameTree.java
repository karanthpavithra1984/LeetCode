package easy.BinaryTree;

import utils.TreeNode;

public class isSameTree {
    /**
     * Worst case o(n), provided we are doing a comparison of unbalanced tree
     * Space complexity o(n) , since we are using recursion
     */

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
