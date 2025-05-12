package medium.BinaryTree;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class isCompleteTree {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean isNulNodeFound = false;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node == null) {
                isNulNodeFound = true;
            } else {
                if (isNulNodeFound) {
                    return false;
                }

                queue.add(node.left);
                queue.add(node.right);
            }

        }

        return true;
    }
}
