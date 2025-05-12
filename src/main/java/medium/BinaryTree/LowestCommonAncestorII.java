package medium.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity we go through trees multiple times , but overall o(n)
 * Space o(n) for recursion and LCA
 */

public class LowestCommonAncestorII {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //Get the LCA first .
        TreeNode ans = LCA(root, p, q);

        //If lca is not equal to P or Q, then that means it found a node which is  a LCA
        //The only edge case is when p or q are returned.
        if (ans == p) {
            //Check if q is in the tree p side of the tree.
            return dfa(p, q) ? p : null;
        } else if (ans == q) {
            //Check if p i in the q side of the tree.
            return dfa(q, p) ? q : null;
        }

        return ans;
    }

    private TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;

        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);

        if (left != null && right != null)
            return root;

        return left != null ? left : right;
    }

    private boolean dfa(TreeNode node, TreeNode target) {

        if (node == target) {
            return true;
        }
        if (node == null) {
            return false;
        }


        return dfa(node.left, target) || dfa(node.right, target);
    }
}
