package medium.Graph.adjacencyList;

import java.util.*;

public class SetenceSimilarityII {
    Map<String, List<String>> adjList;

    public boolean areSentencesSimilarTwo(String[]
                                                  sentence1,
                                          String[] sentence2,
                                          List<List<String>> similarPairs) {
        if(sentence1.length != sentence2.length){
            return false;
        }

        adjList = new HashMap<>();

        for(List<String> pair: similarPairs){
            String pair1 = pair.get(0);
            String pair2 = pair.get(1);
            if(!adjList.containsKey(pair1)){
                adjList.put(pair1, new ArrayList<>());
            }

            if(!adjList.containsKey(pair2)){
                adjList.put(pair2, new ArrayList<>());
            }

            adjList.get(pair1).add(pair2);
            adjList.get(pair2).add(pair1);
        }

        for(int i=0; i < sentence1.length; i++){
            String source = sentence1[i];
            String destination = sentence2[i];

            if(source.equals(destination)){
                continue;
            }

            Set<String> visited = new HashSet<>();
            if(adjList.containsKey(source) && adjList.containsKey(destination)){
                if(!dfs(source, destination, visited)){
                    return false;
                }
            }else{
                return false;
            }
        }

        return true;
    }

    private boolean dfs(String source, String destination, Set<String> visited){
        visited.add(source);

        if(source.equals(destination)){
            return true;
        }

        for(String neighbor: adjList.get(source)){
            if(!visited.contains(neighbor) && dfs(neighbor, destination, visited) ){
                return true;
            }
        }

        return false;
    }
}
