package easy.BinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(n)
 * Space Complexity ArrayList - o(n) + Recursion takes up the space - if its balanced , o(logn), if its unbalanced o(n) -
 * So total o(2n)
 */


public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        traverse(root, res);

        return res;
    }

    private void traverse(TreeNode root, List<Integer> res) {
        if (root == null) return;

        res.add(root.val);
        traverse(root.left, res);
        traverse(root.right, res);
    }
}
