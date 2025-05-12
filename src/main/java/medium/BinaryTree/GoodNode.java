package medium.BinaryTree;

import utils.TreeNode;

public class GoodNode {

    /**
     * Time Complexity o( n)
     * Space Complexity o(n)
     */

    int goodNodes = 0;

    public int goodNodes(TreeNode root) {
        if (root == null) {
            return goodNodes;
        }

        goodNodes = 1;

        dfs(root.left, root.val);
        dfs(root.right, root.val);

        return goodNodes;
    }

    private void dfs(TreeNode root, int maxNode) {
        if (root == null)
            return;

        if (root.val >= maxNode) {
            goodNodes++;
            maxNode = root.val;
        }

        dfs(root.left, maxNode);
        dfs(root.right, maxNode);
    }

}
