package medium.unionfind;

import utils.UnionFind;

/**
 * with differentv subsequent loops , its going to be o(n+e) - n is node and e is edge
 * again findparent is a(t) which is constant
 * <p>
 * <p>
 * Space Is o(n)
 */
public class CountTheCompleteComponents {
    public int countCompleteComponents(int n, int[][] edges) {
        UnionFind uf = new UnionFind(n);
        int[] connection = new int[n];
        int count = 0;
        int[] nodes = new int[n];

        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
            nodes[edge[0]]++;
            nodes[edge[1]]++;
        }

        for (int i = 0; i < n; ++i) {
            //when a node is connected to itself , then count++.
            if (nodes[i] == 0) count++;
        }

        for (int[] edge : edges) {
            //could be anything as both will have same parent
            int ult = uf.findParent(edge[1]);
            //get the edges
            connection[ult]++;
        }

        for (int i = 0; i < n; ++i) {
            //Edges should be equal to m*(m-1)/2 - where m is vertices.
            if (connection[i] > 0 && connection[i] == uf.getRank(i) * (uf.getRank(i) - 1) / 2)
                count++;
        }

        return count;
    }
}
