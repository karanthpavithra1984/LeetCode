package medium.BinaryTree;

import utils.TreeNode;

import java.util.*;

public class AllNodesDistanceK {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // We can build a graph first
        Map<Integer, List<Integer>> graph = new HashMap<>();
        recursiveBuildGraph(graph, root, null);

        Set<Integer> visited = new HashSet<>();
        visited.add(target.val);

        List<Integer> result = new ArrayList<>();
        dfs(target.val, graph, visited, 0, result, k);

        return result;
    }

    private void dfs(int val, Map<Integer, List<Integer>> graph, Set<Integer> visited, int distance, List<Integer> result, int k) {
        if (distance == k) {
            result.add(val);
            return;
        }

        for (int neighbor : graph.getOrDefault(val, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                dfs(neighbor, graph, visited, distance + 1, result, k);
            }
        }

    }

    private void recursiveBuildGraph(Map<Integer, List<Integer>> graph, TreeNode root, TreeNode parent) {
        if (root != null && parent != null) {
            if (!graph.containsKey(root.val)) {
                graph.put(root.val, new ArrayList<>());
            }
            graph.get(root.val).add(parent.val);

            if (!graph.containsKey(parent.val)) {
                graph.put(parent.val, new ArrayList<>());
            }
            graph.get(parent.val).add(root.val);
        }

        if (root.left != null) {
            recursiveBuildGraph(graph, root.left, root);
        }

        if (root.right != null) {
            recursiveBuildGraph(graph, root.right, root);
        }
    }
}
