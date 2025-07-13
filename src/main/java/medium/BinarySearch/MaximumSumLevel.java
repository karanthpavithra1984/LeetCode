package medium.BinarySearch;

import com.sun.source.tree.Tree;
import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumSumLevel {
    public int maxLevelSum(TreeNode root) {

        int maxSum = Integer.MIN_VALUE, maxLevel = 0;
        int level = 0;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int currentSum = 0;
            level++;
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.poll();

                currentSum += curNode.val;
                if (curNode.left != null) {
                    queue.add(curNode.left);
                }

                if (curNode.right != null) {
                    queue.add(curNode.right);
                }
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxLevel = level;
            }

        }

        return maxLevel;
    }
}
