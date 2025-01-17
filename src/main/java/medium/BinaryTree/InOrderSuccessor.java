package medium.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity  o(n)
 * Space Complexity o(n)
 */

public class InOrderSuccessor {
    Integer prevVal;
    int globalP;
    TreeNode successor;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        globalP = p.val;
        inorderSuccessor(root);
        return successor;
    }

    private void inorderSuccessor(TreeNode root) {
        if (root == null) return;
        if(successor == null) {
            inorderSuccessor(root.left);
            if (prevVal != null && prevVal == globalP) {
                successor = root;
            }
            prevVal = root.val;
            inorderSuccessor(root.right);
        }
    }
}
