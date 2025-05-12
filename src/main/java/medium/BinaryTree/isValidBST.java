package medium.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity o(n)
 * Space Complexity Recursion takes up the space - if its balanced , o(logn), if its unbalanced o(n) -
 * So total o(n)
 */

public class isValidBST {

    Integer prevVal;

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        if (!isValidBST(root.left)) {
            return false;
        }
        if (prevVal != null && root.val <= prevVal) {
            return false;
        }
        prevVal = root.val;
        return isValidBST(root.right);
    }

}
