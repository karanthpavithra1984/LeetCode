package medium.BinaryTree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        Queue<TreeNode> values = new ArrayDeque<>();

        if (root != null) {
            values.add(root);
        }

        List<List<Integer>> levels = new ArrayList<>();
        while (!values.isEmpty()) {
            int size = values.size();
            List<Integer> level = new ArrayList<>();
            while (size > 0) {
                TreeNode node = values.poll();
                level.add(node.val);

                if (node.left != null) {
                    values.add(node.left);
                }

                if (node.right != null) {
                    values.add(node.right);
                }
                size--;
            }
            levels.add(level);
        }

        return levels;
    }
}
