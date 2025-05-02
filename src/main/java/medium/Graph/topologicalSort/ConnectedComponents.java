package medium.Graph.topologicalSort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConnectedComponents {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();
        int result = 0 ;
        for(int i= 0 ; i < n ;i++){
            if(!visited.contains(i)){
                dfs(visited, adjList, i);
                result++;
            }
        }


        return result;
    }

    private void dfs(Set<Integer> visited, List<List<Integer>> adjList, int n){
        visited.add(n);
        for(int neighbor : adjList.get(n)){
            if(!visited.contains(neighbor)){
                dfs(visited, adjList, neighbor);
            }
        }
    }
}
