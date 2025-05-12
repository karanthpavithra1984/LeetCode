package medium.MinimumSpanning;

import java.util.*;

public class MiniCostToConnectPoints {
    public int minCostConnectPoints(int[][] points) {
        //Get the points length, they are Nodes
        int N = points.length;
        Map<Integer, List<int[]>> adjList = new HashMap<>();
        //Create adjacency list
        for (int i = 0; i < N; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            //Created adjancey list for every line from this point
            for (int j = i + 1; j < N; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                int dist = Math.abs(x1 - x2) + Math.abs(y1 - y2);

                if (!adjList.containsKey(i)) {
                    adjList.put(i, new ArrayList<>());
                }

                if (!adjList.containsKey(j)) {
                    adjList.put(j, new ArrayList<>());
                }

                adjList.get(i).add(new int[]{dist, j});
                adjList.get(j).add(new int[]{dist, i});
            }
        }

        Set<Integer> vistiedNodes = new HashSet<>();
        int res = 0;

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        priorityQueue.offer(new int[]{0, 0});

        while (vistiedNodes.size() < N) {
            int[] polled = priorityQueue.poll();

            int dist = polled[0];
            int node = polled[1];

            if (vistiedNodes.contains(node)) {
                continue;
            }

            res += dist;
            vistiedNodes.add(node);

            if (adjList.containsKey(node)) {
                for (int[] neighbor : adjList.get(node)) {
                    int nextDist = neighbor[0];
                    int nextNode = neighbor[1];

                    if (!vistiedNodes.contains(nextNode)) {
                        priorityQueue.offer(new int[]{nextDist, nextNode});
                    }

                }
            }
        }

        return res;
    }
}
