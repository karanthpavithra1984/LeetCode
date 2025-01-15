package easy.BinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(n)
 * Space Complexity ArrayList - o(n) + Recursion takes up the space - if its balanced , o(logn), if its unbalanced o(n) -
 * So total o(2n)
 */

public class InOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();

        traverse(root, arr);

        return arr;
    }

    private void traverse(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }

        traverse(root.left, arr);
        arr.add(root.val);
        traverse(root.right, arr);
    }
}
