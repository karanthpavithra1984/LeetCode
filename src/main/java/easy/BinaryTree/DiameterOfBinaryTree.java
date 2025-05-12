package easy.BinaryTree;

import utils.TreeNode;

public class DiameterOfBinaryTree {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        longestPathOfTheTree(root);
        return diameter;
    }

    private int longestPathOfTheTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftPath = longestPathOfTheTree(root.left);
        int rightPath = longestPathOfTheTree(root.right);

        diameter = Math.max(diameter, leftPath + rightPath);

        return Math.max(leftPath, rightPath) + 1;
    }
}
