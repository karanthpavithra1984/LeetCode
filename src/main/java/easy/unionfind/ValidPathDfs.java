package easy.unionfind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidPathDfs {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();

        //Remember this directed vs undirected
        for (int[] edge : edges) {
            if (!adjList.containsKey(edge[0])) {
                adjList.put(edge[0], new ArrayList<>());
            }

            adjList.get(edge[0]).add(edge[1]);
            if (!adjList.containsKey(edge[1])) {
                adjList.put(edge[1], new ArrayList<>());
            }

            adjList.get(edge[1]).add(edge[0]);

        }

        boolean[] visited = new boolean[n];

        return dfs(adjList, visited, source, destination);
    }

    private boolean dfs(Map<Integer, List<Integer>> adjList, boolean[] visited, int source, int destination) {
        if (source == destination) {
            return true;
        }

        if (visited[source]) {
            return false;
        }

        visited[source] = true;

        for (int neighbor : adjList.get(source)) {
            //Remember to return if its boolean.
            //You dont want to be DFSing till end
            if (dfs(adjList, visited, neighbor, destination)) {
                return true;
            }
        }

        return false;
    }
}
