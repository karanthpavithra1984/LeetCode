package medium.Djikstras;

import java.util.*;

/**
 * Time Complexity o(n + eloge) - n is the times , e is the edges and log e is time to add /delete to the queue
 */

public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        //Create adjacency list
        Map<Integer, List<int[]>> adjList = new HashMap<>();

        for (int[] time : times) {
            if (!adjList.containsKey(time[0])) {
                adjList.put(time[0], new ArrayList<>());
            }

            adjList.get(time[0]).add(new int[]{time[1], time[2]});
        }

        Set<Integer> visitedNodes = new HashSet<>();

        PriorityQueue<int[]> queue = new PriorityQueue<>(
                Comparator.comparingInt(o -> o[0]));
        queue.add(new int[]{0, k});

        int time = 0;
        while (!queue.isEmpty()) {
            int[] polledTime = queue.poll();

            int w1 = polledTime[0];
            int n1 = polledTime[1];

            if (visitedNodes.contains(n1)) {
                continue;
            }

            visitedNodes.add(n1);
            time = w1;

            if (adjList.containsKey(n1)) {
                for (int[] values : adjList.get(n1)) {
                    if (!visitedNodes.contains(values[0])) {
                        queue.offer(new int[]{w1 + values[1], values[0]});
                    }
                }
            }
        }


        //If u visit all nodes , return
        return visitedNodes.size() == n ? time : -1;


    }
}
