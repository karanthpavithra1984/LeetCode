package hard.BinaryTree;

import utils.TreeNode;

public class MaxPathSum {
    /**
     * Time Complexity o(n)
     * Space Complexity o(n)
     */
    int maxPathSum;
    public int maxPathSum(TreeNode root) {
        maxPathSum = Integer.MIN_VALUE;
        dfs(root);
        return maxPathSum;
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right),0);

        maxPathSum = Math.max(maxPathSum, root.val + left + right);

        return Math.max(left, right) + root.val;
    }
}
