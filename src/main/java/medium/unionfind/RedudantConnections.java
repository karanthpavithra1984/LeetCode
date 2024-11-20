package medium.unionfind;

/**
 * Time Complexity - O(V+(E∗α(V)))
 * Space complexity o(V)
 * Where V s the number of vertices and
 * E is the number of edges in the graph.
 * α() is used for amortized complexity.
 */

public class RedudantConnections {
    int[] parent;
    int[] rank;

    public int[] findRedundantConnection(int[][] edges) {
        parent = new int[edges.length + 1];
        rank = new int[edges.length + 1];
        for (int i = 1; i < parent.length; i++) {
            parent[i] = i;
            rank[i] = 1;
        }

        for (int i = 0; i < edges.length; i++) {
            if (!unionAndFind(edges[i][0], edges[i][1])) {
                return new int[]{edges[i][0], edges[i][1]};
            }
        }

        return new int[0];
    }

    private int findParent(int n) {
        int par = parent[n];

        while (par != parent[par]) {
            parent[par] = parent[parent[par]]; //Compression where you are saving the gradfather node
            par = parent[par];
        }

        return par;
    }

    private boolean unionAndFind(int e1, int e2) {
        int par1 = findParent(e1);
        int par2 = findParent(e2);

        if (par1 == par2) {
            return false; //cycle detected return false.
        }

        if (rank[par1] > rank[par2]) {
            parent[par2] = par1;
            rank[par1] += rank[par2];
        } else {
            parent[par1] = par2;
            rank[par2] += rank[par1];
        }

        return true;
    }
}
