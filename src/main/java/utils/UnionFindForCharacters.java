package utils;

public class UnionFindForCharacters {
    int[] parent;

    public UnionFindForCharacters(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int findParent(int n) {
        int par = parent[n];
        //Finding the parent by finding the root node, where it is parent of itself
        while (par != parent[par]) {
            parent[par] = parent[parent[par]]; //Path Compression
            par = parent[par];
        }

        return par;
    }

    public boolean union(int edge1, int edge2) {
        int par1 = findParent(edge1);
        int par2 = findParent(edge2);

        if (par1 == par2) {
            return false; // Union wasnt possible;
        }

        if (par1 < par2) {
            parent[par2] = par1;
        } else {
            parent[par1] = par2;
        }

        return true;
    }
}
