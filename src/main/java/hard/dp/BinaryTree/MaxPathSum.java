package hard.dp.BinaryTree;

import utils.TreeNode;

public class MaxPathSum {
    /**
     * Time Complexity o(n)
     * Space Complexity o(n)
     */
    int maxPathSum = 0;

    public int maxPathSum(TreeNode root) {
        maxPathSum = 0;
        dfs(root);
        return maxPathSum;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //Note there will be negative numbers, so we need to ignore them
        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);

        maxPathSum = Math.max(maxPathSum, left + right + root.val);

        //Choose between the maximum value
        return Math.max(left, right) + root.val;
    }


}
