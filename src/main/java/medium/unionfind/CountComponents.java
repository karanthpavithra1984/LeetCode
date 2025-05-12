package medium.unionfind;

import utils.UnionFind;

/**
 * For T operations, the amortized time complexity of the union-find algorithm (using path compression with union by rank)
 * is O(alpha(T)).
 * Here, α(T) is the inverse Ackermann function that grows so slowly,
 * that it doesn't exceed 4 for all reasonable T (approximately T<10
 * 600
 * ) Because the function grows so slowly, we consider it to be O(1).
 * Initializing UnionFind takes O(n) time beacuse we are initializing the parent and rank arrays of size n + 1 each.
 * We iterate through every edge and perform union of the nodes connected by the edge which takes O(1) time per operation.
 * It takes O(e) time for e edges.
 * <p>
 * So its basically o(n+e) - where n is number of nodes, e is edges
 * <p>
 * Space complexity o(n)
 * We are using the parent and rank arrays, both of which require O(n) space each.
 */

public class CountComponents {
    public int countComponents(int n, int[][] edges) {
        UnionFind unionFind = new UnionFind(n);
        int result = n;

        for (int[] edge : edges) {
            if (unionFind.union(edge[0], edge[1])) {
                result--;
            }
        }

        return result;

    }
}
