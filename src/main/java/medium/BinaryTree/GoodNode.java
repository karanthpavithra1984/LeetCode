package medium.BinaryTree;

import utils.TreeNode;

public class GoodNode {

    /**
     * Time Complexity o( n)
     * Space Complexity o(n)
     */
    
    Integer goodNodes;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;

        goodNodes = 1;
        dfs(root.left, root.val);
        dfs(root.right, root.val);

        return goodNodes;
    }

    private void dfs(TreeNode root, int maxNode) {
        if(root == null) return;

        if(root.val >= maxNode) {
            goodNodes++;
            maxNode = root.val;
        }

        dfs(root.left, maxNode);
        dfs(root.right, maxNode);
    }

}
