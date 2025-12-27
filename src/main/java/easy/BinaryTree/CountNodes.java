package easy.BinaryTree;

import utils.TreeNode;

public class CountNodes {

    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
