package medium.Graph.topologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleii {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];

        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adjList.add(i, new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            adjList.get(pre[0]).add(pre[1]);
            //Add the prerequisite to indegree
            inDegree[pre[1]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            //The one which is not a prerequisite
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        LinkedList<Integer> courses = new LinkedList<>();

        while (!queue.isEmpty()) {
            int course = queue.poll();
            courses.addFirst(course);

            for (int neighbor : adjList.get(course)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (courses.size() == numCourses) {
            return courses.stream().mapToInt(x -> x).toArray();
        }
        return new int[0];
    }
}
