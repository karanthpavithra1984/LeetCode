package medium.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity o(n)
 * Space Complexity o(1)
 */

public class ConnectToRightNode {
    public TreeNode connect(TreeNode root) {
        if(root == null) return null;

        TreeNode traverseHead = root; //Keep a hold of the root

        while(traverseHead.left != null) {
            //We need to hold the node
            TreeNode node = traverseHead;
            while(node != null){
                node.left.next = node.right;
                if(node.next != null){
                    node.right.next = node.next.left;
                }
                node = node.next;
            }
            traverseHead = traverseHead.left;
        }

        return root;
    }
}
