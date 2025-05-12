package utils;

public class UnionFindii {
    int[] parent;
    int[] rank;

    public UnionFindii(int n) {
        this.parent = new int[n + 1];
        this.rank = new int[n + 1];

        for (int i = 1; i < n; i++) {
            parent[i] = i; // Initialize the vertices
            rank[i] = 1; //Initialize the rank
        }
    }

    public int findParent(int val) {
        if (val != parent[val]) {
            parent[val] = findParent(parent[val]);
        }

        return parent[val];
    }

    public boolean union(int edge1, int edge2) {
        int par1 = findParent(edge1);
        int par2 = findParent(edge2);

        if (par1 == par2) {
            return false; //Union is already performed or not found
        }

        if (rank[par1] > rank[par2]) {
            //par1 is parent of the parent of par2
            parent[par2] = par1;
            rank[par1] += rank[par2];
        } else {
            parent[par1] = par2;
            rank[par2] += rank[par1];
        }

        return true;
    }

    public int findRank(int edge) {
        return rank[edge];
    }
}
