package medium.Graph.topologicalSort;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(m+n)
 */
public class CourseScheduleDfs {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        //Add adjucency list
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            adj.get(pre[0]).add(pre[1]);
        }

        boolean[] visited = new boolean[numCourses + 1];

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(adj, visited, i)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(List<List<Integer>> adj, boolean[] visited, int node) {
        if (visited[node]) {
            return false;
        }

        if (adj.get(node).isEmpty()) {
            return true;
        }

        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!dfs(adj, visited, neighbor)) {
                return false;
            }
        }

        visited[node] = false;
        adj.get(node).clear();
        return true;
    }
}
