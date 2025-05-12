package easy.BinaryTree;

import utils.TreeNode;

/**
 * Worst case o(n), provided the value is on an unbalanced tree
 * Space complexity o(n) , since we are using recursion
 */

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }
}
