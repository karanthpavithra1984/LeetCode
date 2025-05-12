package easy.unionfind;

import utils.UnionFindii;

/**
 * Time Complexity -
 * Find parent is amortized - a(T) where t is operation.
 * Parent and rank is o(n)
 * Looping through edges , o(e)
 * so time complexity is o(n + e) ->
 * <p>
 * Space complexity is o(2n) for the parent and rank
 */
public class ValidPath {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UnionFindii unionFind = new UnionFindii(n);

        for (int[] edge : edges) {
            unionFind.union(edge[0], edge[1]);
        }

        return unionFind.findParent(source) == unionFind.findParent(destination);

    }
}
