package medium.Djikstras;

import java.util.*;

/**
 * Time o(m + (n+m)logn))
 * m -> number of edges
 * nlogn -> Number of nodes pushed to priority queue
 * mlogn -> This is undirected so each edge is considered
 */

public class PathWithMinimumProbability {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        //Create adjaceny List first
        Map<Integer, List<double[]>> adjacencyList = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            //Remember this is undirected
            if (!adjacencyList.containsKey(edge[0])) {
                adjacencyList.put(edge[0], new ArrayList<>());
            }

            if (!adjacencyList.containsKey(edge[1])) {
                adjacencyList.put(edge[1], new ArrayList<>());
            }

            adjacencyList.get(edge[0]).add(new double[]{edge[1], succProb[i]});
            adjacencyList.get(edge[1]).add(new double[]{edge[0], succProb[i]});
        }

        double[] probOfNode = new double[n];

        //Note order by maximum probability
        PriorityQueue<double[]> queue = new PriorityQueue<>(Comparator.comparingDouble(a -> -a[0]));
        //Add starting node
        queue.offer(new double[]{1d, start_node});

        while (!queue.isEmpty()) {
            double[] currentNode = queue.poll();
            double curProb = currentNode[0];
            int curNode = (int) currentNode[1];

            if (curNode == end_node) {
                return curProb;
            }

            if (curProb > probOfNode[curNode]) {
                probOfNode[curNode] = curProb;
                if (adjacencyList.containsKey(curNode)) {
                    for (double[] node : adjacencyList.get(curNode)) {
                        int nextNode = (int) node[0];
                        double nextNodeProb = node[1];
                        queue.offer(new double[]{curProb * nextNodeProb, nextNode});
                    }
                }
            }
        }

        return 0d;
    }
}
