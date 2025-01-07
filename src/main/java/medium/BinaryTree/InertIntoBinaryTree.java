package medium.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity - o(logn) in the average case and if the tree is not balanced o(n)
 * Space Complexity - same as time complexity
 */

public class InertIntoBinaryTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // Insert into the leaf Node
        if(root == null){
            return new TreeNode(val);
        }

        if(val > root.val){
            //right node
            root.right = insertIntoBST(root.right, val);
        }else{
            //left node
            root.left = insertIntoBST(root.left, val);
        }

        return root;
    }
}
