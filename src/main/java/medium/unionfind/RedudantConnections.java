package medium.unionfind;

/**
 * Refer to Count Components
 * Time Complexity - O(V+E) - V is vertices or nodes, E is edges
 * Space complexity o(V)
 * Where V s the number of vertices and
 * E is the number of edges in the graph.
 * α() is used for amortized complexity.
 */

public class RedudantConnections {

    public int[] findRedundantConnection(int[][] edges) {
        UF unionFind = new UF(edges.length + 1);

        for (int i = 0; i < edges.length; i++) {
            if (!unionFind.unionFind(edges[i][0], edges[i][1])) {
                return new int[]{edges[i][0], edges[i][1]};
            }
        }

        return new int[0];
    }
}

class UF {
    int[] parent;
    int[] rank;

    UF(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 1; i < n; i++) {
            parent[i] = i;
            rank[i] = i;
        }
    }

    public int findParent(int n) {
        if (parent[n] != n) {
            parent[n] = findParent(parent[n]);
        }

        return parent[n];
    }

    public boolean unionFind(int n1, int n2) {
        int parent1 = findParent(n1);
        int parent2 = findParent(n2);

        if (parent1 == parent2) {
            return false;
        }

        if (rank[parent1] > rank[parent2]) {
            parent[parent2] = parent1;
            rank[parent1] += rank[parent2];
        } else {
            parent[parent1] = parent2;
            rank[parent2] += rank[parent1];
        }

        return true;
    }
}
