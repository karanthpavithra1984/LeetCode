package medium.Djikstras;

import java.util.*;

public class NumberOfWaysToDestination {
    public int countPaths(int n, int[][] roads) {
        int MOD = 1000000007;
        Map<Integer, List<int[]>> adjacenyList = new HashMap<>();
        //Created adjacency list
        for (int[] road : roads) {
            if (!adjacenyList.containsKey(road[0])) {
                adjacenyList.put(road[0], new ArrayList<>());
            }

            if (!adjacenyList.containsKey(road[1])) {
                adjacenyList.put(road[1], new ArrayList<>());
            }

            adjacenyList.get(road[0]).add(new int[]{road[1], road[2]});
            adjacenyList.get(road[1]).add(new int[]{road[0], road[2]});
        }

        //Two integer array, one for shortest distance, one for pathCount
        long[] shortestDistance = new long[n];
        //Since we need to track the shortestDistance
        Arrays.fill(shortestDistance, Long.MAX_VALUE);

        int[] pathToNodes = new int[n];

        shortestDistance[0] = 0; //To 0 its 0
        pathToNodes[0] = 1; //It starts there so 1

        PriorityQueue<long[]> queue = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));

        queue.offer(new long[]{0, 0});

        while (!queue.isEmpty()) {
            long[] curNode = queue.poll();

            long distance = curNode[0];
            int node = (int) curNode[1];
            //If the distance is already greater than the node
            if (distance > shortestDistance[node]) {
                continue;
            }

            if (adjacenyList.containsKey(node)) {
                for (int[] neighbor : adjacenyList.get(node)) {
                    int nextNode = neighbor[0];
                    int nextDistance = neighbor[1];

                    long totalTime = distance + nextDistance;

                    if (totalTime < shortestDistance[nextNode]) {
                        pathToNodes[nextNode] = pathToNodes[node];
                        shortestDistance[nextNode] = totalTime;

                        queue.offer(new long[]{totalTime, nextNode});
                    } else if (totalTime == shortestDistance[nextNode]) {
                        //We found another , so add it
                        pathToNodes[nextNode] =
                                (pathToNodes[nextNode] + pathToNodes[node]) % MOD;
                    }
                }
            }
        }

        return pathToNodes[n - 1];
    }
}
