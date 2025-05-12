package hard.graph;

import java.util.*;

public class ParallelCoursesIII {
    public int minimumTime(int n, int[][] relations, int[] time) {

        int[] indegree = new int[n + 1];
        Map<Integer, List<Integer>> courseAdj = new HashMap<>();

        /**
         * Time Complexity e
         */
        for (int i = 1; i <= n; i++) {
            courseAdj.put(i, new ArrayList<>());
        }

        for (int[] relation : relations) {
            courseAdj.get(relation[0]).add(relation[1]);
            indegree[relation[1]]++;
        }


        int[] totalTime = new int[n];

        Queue<Integer> nodes = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                nodes.add(i);
            }
            totalTime[i] = time[i - 1];
        }

        while (!nodes.isEmpty()) {
            int node = nodes.poll();
            for (int neighbor : courseAdj.get(node)) {
                indegree[neighbor]--;
                totalTime[neighbor] =
                        Math.max(totalTime[neighbor], time[neighbor - 1] + totalTime[node]);

                if (indegree[neighbor] == 0) {
                    nodes.add(neighbor);
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < totalTime.length; i++) {
            ans = Math.max(ans, totalTime[i]);
        }


        return ans;
    }
}
