package medium.Graph.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * O(n + m+ n + m) -> o(2n+2m)
 */

public class CourseScheduleDFS {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        //Initialize
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] preReq : prerequisites) {
            adj.get(preReq[0]).add(preReq[1]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] inThePath = new boolean[numCourses];

        //Run dfs on them

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, adj, inThePath, visited)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int i, List<List<Integer>> adj, boolean[] visited, boolean[] inThePath) {
        //If in the path cyclic
        if (inThePath[i]) {
            return false;
        }

        if (visited[i]) {
            return true;
        }

        visited[i] = true;
        inThePath[i] = true;

        for (int neighbor : adj.get(i)) {
            if (!dfs(neighbor, adj, visited, inThePath)) {
                return false;
            }
        }

        //Remove from the path
        inThePath[i] = false;
        return true;
    }
}
