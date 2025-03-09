package hard.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParallelCoursesIIIDfs {


    public int minimumTime(int n, int[][] relations, int[] time) {
        Map<Integer, List<Integer>> graph;
        graph = new HashMap<>();
        for (int[] relation : relations) {
            if (!graph.containsKey(relation[0])) {
                graph.put(relation[0], new ArrayList<>());
            }
            graph.get(relation[0]).add(relation[1]);
        }

        int[] totalTime = new int[n + 1];

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, dfs(graph, totalTime, i, time));
        }

        return ans;

    }

    private int dfs(Map<Integer,List<Integer>> graph, int[] totalTime, int node, int[] time) {
        if (totalTime[node] != 0) {
            return totalTime[node];
        }

        if (graph.get(node) == null || graph.get(node).size() == 0) {
            return time[node - 1];
        }

        int ans = 0;
        for (int neighbor : graph.get(node)) {
            ans = Math.max(ans, dfs(graph , totalTime, neighbor, time));
        }

        return totalTime[node] = ans + time[node - 1];
    }
}
