package easy.unionfind;

import utils.UnionFind;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int N = isConnected.length;
        UnionFind unionFind = new UnionFind(N);
        int numberOfProvinces = N;

        for(int r=0 ; r< isConnected.length; r++){
            for(int c=0; c< isConnected[0].length;c++){
                //If i and j are difference coordinates
                if(isConnected[r][c] == 1 && r != c){
                    if(unionFind.union(r,c)){
                        numberOfProvinces--;
                    }
                }
            }
        }

        return numberOfProvinces;
    }
}
