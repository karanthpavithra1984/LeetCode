package easy.BinaryTree;

import utils.TreeNode;
/**
 * Worst case o(n), provided we are doing a comparison of unbalanced tree
 * Space complexity o(n) , since we are using recursion
 */
public class MinimumDepth {
    public int minDepth(TreeNode root) {
       if(root == null)
           return 0;

       if(root.left == null){
           //If root left is null, then its not a leaf, so only do a recursion on right
           return 1+minDepth(root.right);
       }else if(root.right == null){
           //If root right is null, then its not a leaf, so only do a recursion on left
           return 1+minDepth(root.left);
       }

        //do a recursion on both min and max;
       return 1+ Math.min(minDepth(root.left) , minDepth(root.right));

    }
}
