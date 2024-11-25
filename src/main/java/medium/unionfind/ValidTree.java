package medium.unionfind;

import utils.UnionFind;

/**
 * O(V+E) - V is vertices/nodes and E is edge
 * Space Complexity O(V) - V is the vertices
 */
public class ValidTree {
    public boolean validTree(int n, int[][] edges) {
        //Edges needs to be one less than n for the tree
        if(edges.length != n-1) return false;

        UnionFind unionFind = new UnionFind(n);

        for(int[] edge : edges){
            if(!unionFind.union(edge[0], edge[1]))
                return false;
        }

        return true;
    }
}
