package medium.Graph.topologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleii {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];

        //Adj list
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] prerequisite : prerequisites){
            graph.get(prerequisite[1]).add(prerequisite[0]);
            inDegree[prerequisite[0]]++;
        }

        List<Integer> orderOfCourses = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int course = queue.poll();
            orderOfCourses.add(course);

            for(Integer neighbor: graph.get(course)){
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }

        if(orderOfCourses.size() == numCourses){
            return orderOfCourses.stream().mapToInt(i -> i).toArray();
        }
        return new int[0];
    }
}
