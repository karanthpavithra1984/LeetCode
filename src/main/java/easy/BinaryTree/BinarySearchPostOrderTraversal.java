package easy.BinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(n)
 * Space Complexity ArrayList - o(n) + Recursion takes up the space - if its balanced , o(logn), if its unbalanced o(n) -
 * So total o(2n)
 */

public class BinarySearchPostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(root, result);
        return result;
    }

    private void postorderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) return;

        postorderTraversal(root.left, result);
        postorderTraversal(root.right, result);
        result.add(root.val);
    }
}
