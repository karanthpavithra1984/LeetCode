package medium.BinaryTree;

import utils.TreeNode;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        return preOrderTraversal(root, sum);
    }

    private Integer preOrderTraversal(TreeNode root, int sum) {
        if (root == null) return 0;

        sum = sum * 10 + root.val;

        if (root.right == null && root.left == null) {
            return sum;
        }

        int leftSum = preOrderTraversal(root.left, sum);
        int rightSum = preOrderTraversal(root.right, sum);

        return leftSum + rightSum;
    }


}
