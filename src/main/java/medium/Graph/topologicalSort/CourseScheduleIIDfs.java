package medium.Graph.topologicalSort;

import java.util.*;

public class CourseScheduleIIDfs {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] preq : prerequisites) {
            adjList.get(preq[0]).add(preq[1]);
        }


        Set<Integer> visited = new HashSet<>();
        Set<Integer> inStack = new HashSet<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(visited, inStack, linkedList, adjList, i)) {
                return new int[0];
            }
        }

        if (linkedList.size() == numCourses) {
            return linkedList.stream().mapToInt(x -> x).toArray();
        }

        return new int[0];
    }

    private boolean dfs(Set<Integer> visited, Set<Integer> inStack, List<Integer> linkedList,
                        List<List<Integer>> adjList, int node) {
        if (visited.contains(node)) {
            return false;
        }

        if (inStack.contains(node)) {
            return true;
        }
        visited.add(node);

        for (int neighbor : adjList.get(node)) {
            if (!dfs(visited, inStack, linkedList, adjList, neighbor)) {
                return false;
            }
        }

        visited.remove(node);
        inStack.add(node);
        linkedList.add(node);
        return true;

    }
}
