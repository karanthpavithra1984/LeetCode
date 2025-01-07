package medium.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity - o(2logn) in the average case and if the tree is not balanced o(2n)
 * -2 because we go twice, once to get the min value and the other to delete it.
 * Space Complexity - same as time complexity without 2 to keep the recursion stack
 */

public class DeleteNode {
    private TreeNode minValueNode(TreeNode root) {
        TreeNode current = root;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null; // Just return the null i.e deleting
        }
        if (key > root.val) {
            // value is on the right side
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            //value is on the left side
            root.left = deleteNode(root.left, key);
        } else if (root.left == null) {
            // if no or 1 children , then just return the reverse
            return root.right;
        } else if (root.right == null) {
            //if no or 1 children , then just return the reverse
            return root.left;
        } else {
            //2 children
            // Get the minValue
            TreeNode minValueNode = minValueNode(root.right);
            //set the current node value to minvalue
            root.val = minValueNode.val;
            //delete the minvalue node
            root.right = deleteNode(root.right, minValueNode.val);
        }

        return root;
    }
}
