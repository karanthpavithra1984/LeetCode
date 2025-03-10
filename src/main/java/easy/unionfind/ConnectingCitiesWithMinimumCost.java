package easy.unionfind;

import utils.UnionFindii;

import java.util.Arrays;
import java.util.Comparator;

public class ConnectingCitiesWithMinimumCost {
    public int minimumCost(int n, int[][] connections) {
        UnionFindii unionFindii = new UnionFindii(n);

        int totalVertex = 0;
        int cost = 0;
        Arrays.sort(connections, Comparator.comparingInt(o -> o[2]));

        for(int[] connection: connections){
            if(!unionFindii.union(connection[0], connection[1])){
                continue;
            }
            cost+= connection[2];
            totalVertex++;
        }

        if(totalVertex == n-1){
            return cost;
        }

        return  -1;
    }
}
