package easy.BinaryTree;

import utils.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return calculatePathSum(root, targetSum, sum);
    }

    private boolean calculatePathSum(TreeNode root, int targetSum, int sum) {
        if (root == null) return false;

        sum += root.val;

        if (root.left == null && root.right == null && sum == targetSum) {
            return true;
        }

        if (calculatePathSum(root.left, targetSum, sum)) {
            return true;
        }
        return calculatePathSum(root.right, targetSum, sum);
    }
}
