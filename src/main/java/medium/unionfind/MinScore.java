package medium.unionfind;

import utils.UnionFind;

/**
 * with differentv subsequent loops , its going to be o(n+e) - n is node and e is edge
 * again findparent is a(t) which is constant
 * <p>
 * <p>
 * Space Is o(n)
 */

public class MinScore {
    public int minScore(int n, int[][] roads) {
        UnionFind unionFind = new UnionFind(n + 1);
        int min = Integer.MAX_VALUE;
        for (int[] road : roads) {
            unionFind.union(road[0], road[1]);
        }

        for (int[] road : roads) {
            //Parents of both edges are going to be same.
            //hence use only 1 edge and check the first parent distance from there.
            if (unionFind.findParent(road[0]) == unionFind.findParent(1)) {
                min = Math.min(road[2], min);
            }
        }

        return min;
    }
}
