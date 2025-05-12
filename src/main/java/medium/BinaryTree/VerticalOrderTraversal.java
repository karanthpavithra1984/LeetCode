package medium.BinaryTree;

import org.apache.commons.lang3.tuple.Pair;
import utils.TreeNode;

import java.util.*;

/**
 * Time Complexity - So you basically go through each Node o(n)
 * Space Complexity o(logn) for the column map , logn for the list which we return if balanced
 * But if its unbalance , worst case its o(n)
 */
public class VerticalOrderTraversal {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        Map<Integer, List<Integer>> columnNodeMap = new HashMap<>();
        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        int column = 0; //root is always 0
        queue.add(Pair.of(root, 0));
        int minValue = 0, maxValue = 0;//use this to get range later to add to the list later
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> pair = queue.poll();
            if (pair.getLeft() != null) {
                column = pair.getRight();
                if (!columnNodeMap.containsKey(pair.getRight())) {
                    columnNodeMap.put(column, new ArrayList<>());
                }
                //Add it to the columnMap
                columnNodeMap.get(column).add(pair.getLeft().val);
                minValue = Math.min(minValue, column);
                maxValue = Math.max(maxValue, column);
                queue.offer(Pair.of(pair.getLeft().left, column - 1));
                queue.offer(Pair.of(pair.getLeft().right, column + 1));
            }
        }

        List<List<Integer>> verticalResult = new ArrayList<>();

        for (int i = minValue; i <= maxValue; i++) {
            List<Integer> values = columnNodeMap.get(i);
            verticalResult.add(values);
        }
        return verticalResult;
    }
}
