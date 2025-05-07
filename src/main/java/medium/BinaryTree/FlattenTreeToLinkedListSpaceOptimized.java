package medium.BinaryTree;

import utils.TreeNode;

/**
 * Recursion way
 */
public class FlattenTreeToLinkedListSpaceOptimized {
    public void flatten(TreeNode root) {
        flattenTree(root);
    }

    private TreeNode flattenTree(TreeNode root) {
        if (root == null) return null;

        //Return leaf Node;
        if (root.left == null && root.right == null) {
            return root;
        }

        TreeNode leftTail = flattenTree(root.left);
        TreeNode rightTrail = flattenTree(root.right);

        if (leftTail != null) {
            leftTail.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        return rightTrail != null ? rightTrail : leftTail;
    }
}
