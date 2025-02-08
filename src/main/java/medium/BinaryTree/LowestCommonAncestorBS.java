package medium.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity - o(n) - if the binary search tree is unbalanced and has all the nodes on left or right
 * Space - o(N) - Same as above
 * Recursion memory
 */
public class LowestCommonAncestorBS {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root; //If the values of p& q are on either side , return the root.
        }
    }
}
