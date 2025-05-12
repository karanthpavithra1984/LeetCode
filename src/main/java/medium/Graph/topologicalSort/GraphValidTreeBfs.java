package medium.Graph.topologicalSort;

import java.util.*;

public class GraphValidTreeBfs {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, -1});

        Set<Integer> visited = new HashSet<>();

        while (!queue.isEmpty()) {
            int[] node = queue.poll();

            if (visited.contains(node[0])) {
                return false;
            }

            visited.add(node[0]);
            for (int neighbor : adjList.get(node[0])) {
                if (neighbor == node[1]) {
                    continue;
                }

                if (visited.contains(neighbor)) {
                    return false;
                }

                queue.offer(new int[]{neighbor, node[0]});
            }
        }

        return visited.size() == n;
    }


}
