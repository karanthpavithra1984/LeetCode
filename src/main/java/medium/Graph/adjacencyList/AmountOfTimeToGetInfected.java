package medium.Graph.adjacencyList;

import utils.TreeNode;

import java.util.*;

public class AmountOfTimeToGetInfected {
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, Set<Integer>> adjList = new HashMap<>();

        convertToGraph(adjList, 0, root);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        Set<Integer> visited = new HashSet<>();
        visited.add(start);

        int total = 0;

        while (!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0 ; i < size; i++){
                int value = queue.poll();

                for(Integer neighbor :adjList.get(value)){
                    if(!visited.contains(neighbor)){
                        visited.add(neighbor);
                        queue.offer(neighbor);
                    }
                }
            }

            total++;
        }

        return total-1;
    }

    private void convertToGraph(Map<Integer, Set<Integer>> adjList, int parent, TreeNode current) {
        if(current == null){
            return;
        }

        if(!adjList.containsKey(current.val)){
            adjList.put(current.val, new HashSet<>());
        }

        if(parent > 0){
            adjList.get(current.val).add(parent);
        }

        //Add left and right to the current
        if(current.left != null){
            adjList.get(current.val).add(current.left.val);
        }

        if(current.right != null){
            adjList.get(current.val).add(current.right.val);
        }

        convertToGraph(adjList, current.val, current.left);
        convertToGraph(adjList, current.val, current.right);
    }


}
