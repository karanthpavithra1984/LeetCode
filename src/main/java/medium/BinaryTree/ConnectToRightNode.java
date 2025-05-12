package medium.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity o(n)
 * Space Complexity o(1)
 */

public class ConnectToRightNode {
    public TreeNode connect(TreeNode root) {
        if (root == null) return null;

        TreeNode traverseNode = root;

        //Since there is going to be a left node
        while (traverseNode.left != null) {
            TreeNode node = traverseNode;

            while (node != null) {
                node.left.next = node.right;
                if (node.next != null) {
                    node.right.next = node.next.left;
                }

                node = node.next;
            }

            traverseNode = traverseNode.left;
        }


        return root;
    }
}
