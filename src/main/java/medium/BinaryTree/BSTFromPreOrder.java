package medium.BinaryTree;

import utils.TreeNode;

public class BSTFromPreOrder {
    /**
     * Time Complexity o(n)
     * Space compleity o(1)
     *
     * @param preorder
     * @return
     */
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for (int num : preorder) {
            root = traverse(num, root);
        }
        return root;
    }

    private TreeNode traverse(int num, TreeNode root) {
        if (root == null) {
            return new TreeNode(num);
        }

        if (num < root.val) {
            root.left = traverse(num, root.left);
        }

        if (num > root.val) {
            root.right = traverse(num, root.right);
        }

        return root;
    }
}
