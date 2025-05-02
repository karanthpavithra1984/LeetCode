package medium.Graph.topologicalSort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i= 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        //To Detect cycle
        Set<Integer> visited = new HashSet<>();

        if(!dfs(adjList, -1, 0, visited)){
            return false;
        }

        //Its possible they are two different trees
        return visited.size() == n;
    }

    private boolean dfs(List<List<Integer>> adjList, int parent, int node, Set<Integer> visited){
        if(visited.contains(node)){
            return false;
        }

        visited.add(node);

        for(int neighbor : adjList.get(node)){
            //Bidirectional adjList
            if(neighbor == parent){
                continue;
            }

            if(!dfs(adjList, node, neighbor, visited)){
                return false;
            }
        }

        return true;
    }
}
