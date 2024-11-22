package medium.unionfind;

/**
 * Time Complexity - O(V+(E∗α(V)))
 * Space complexity o(V)
 * Where V s the number of vertices and
 * E is the number of edges in the graph.
 * α() is used for amortized complexity.
 */

public class CountComponents {
    public int countComponents(int n, int[][] edges) {
        UnionFind unionFind = new UnionFind(n);
        int result = n;

        for(int[] edge : edges){
            if(unionFind.union(edge[0],edge[1])){
                result--;
            }
        }

        return result;

    }
}
