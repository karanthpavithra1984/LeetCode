package medium.BinaryTree;

import utils.TreeNode;

public class MinimumDistanceInBsT {
    private int minValue;
    private Integer prev;
    public int minDiffInBST(TreeNode root) {
        minValue = Integer.MAX_VALUE;
        prev = null;
        dfs(root);
        return minValue;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;

        //In Order traversal
        dfs(root.left);
        if(prev != null){
            minValue = Math.min(minValue, root.val - prev);
        }
        prev = root.val;
        dfs(root.right);
    }
}
