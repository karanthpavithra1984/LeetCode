package easy.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity can be reduced by not traversing if the values are not in the range , since this is BST
 */

public class RangeOfBinarySum {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root, low, high);
        return sum;
    }

    private void dfs(TreeNode root, int low, int high) {
        if (root == null) return;

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if (root.val > low)
            dfs(root.left, low, high);
        if (root.val < high)
            dfs(root.right, low, high);
    }

}
