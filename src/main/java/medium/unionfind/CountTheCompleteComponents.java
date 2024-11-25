package medium.unionfind;

import utils.UnionFind;

public class CountTheCompleteComponents {
    public int countCompleteComponents(int n, int[][] edges) {
        UnionFind uf = new UnionFind(n);
        int connection[] = new int[n];
        int count = 0;
        int nodes[] = new int[n];

        for(int edge[]: edges){
            uf.union(edge[0], edge[1]);
            nodes[edge[0]]++;
            nodes[edge[1]]++;
        }

        for(int i=0;i<n;++i){
            if(nodes[i]==0) ++count;
        }

        for(int edge[]: edges){
            int ult = uf.findParent(edge[0]);
            connection[ult]++;
        }

        for(int i=0;i<n;++i){
            if(connection[i]>0 && connection[i]==uf.getRank(i)*(uf.getRank(i)-1)/2)
                ++count;
        }

        return count;
    }
}
