package medium.BinaryTree;

import utils.TreeNode;

/**
 * We go through all the nodes hence o(n)
 * Space is the stack trace space i.e o(n)
 */
public class LongestUniValuePath {
    int longestPath = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root, -1);
        return longestPath;
    }

    private int dfs(TreeNode root, int val) {
        if (root == null) return 0;

        int leftNodePath = dfs(root.left, root.val);
        int rightNodePath = dfs(root.right, root.val);

        longestPath = Math.max(longestPath, leftNodePath + rightNodePath);

        return root.val == val ? Math.max(leftNodePath, rightNodePath) + 1 : 0;
    }
}
