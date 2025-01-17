package easy.BinaryTree;

import utils.TreeNode;

/**
 * Time Complexity o(n)
 * Space Complexity ArrayList - o(n) + Recursion takes up the space - if its balanced , o(logn), if its unbalanced o(n) -
 * So total o(2n)
 */

public class MinimumDifferenceBetweenNodes {
    Integer minimum = Integer.MAX_VALUE;
    Integer prevValue;

    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return minimum;
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) return;

        inOrderTraversal(root.left);
        if (prevValue != null)
            minimum = Math.min(minimum, root.val - prevValue);

        prevValue = root.val;
        inOrderTraversal(root.right);
    }
}
