package medium.unionfind;

/**
 * Time Complexity - O(V+(E∗α(V)))
 * Space complexity o(V)
 * Where V s the number of vertices and
 * E is the number of edges in the graph.
 * α() is used for amortized complexity.
 */

public class RedudantConnections {

    public int[] findRedundantConnection(int[][] edges) {
       UnionFind unionFind = new UnionFind(edges.length + 1);

        for (int i = 0; i < edges.length; i++) {
            if (!unionFind.union(edges[i][0], edges[i][1])) {
                return new int[]{edges[i][0], edges[i][1]};
            }
        }

        return new int[0];
    }
}
