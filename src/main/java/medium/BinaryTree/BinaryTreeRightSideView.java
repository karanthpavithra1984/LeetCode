package medium.BinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> dequeue = new LinkedList<>();
        if (root != null) {
            dequeue.add(root);
        }

        List<Integer> values = new ArrayList<>();

        while (!dequeue.isEmpty()) {
            int size = dequeue.size();
            for (int i = 0; i < size; i++) {
                TreeNode value = dequeue.poll();

                if (i == 0) {
                    values.add(value.val);
                }

                //Add right first
                if (value.right != null) {
                    dequeue.add(value.right);
                }

                if (value.left != null) {
                    dequeue.add(value.left);
                }
            }
        }

        return values;

    }

}
