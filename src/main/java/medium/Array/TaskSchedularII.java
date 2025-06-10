package medium.Array;

import java.util.HashMap;
import java.util.Map;

public class TaskSchedularII {
    public long taskSchedulerII(int[] tasks, int space) {
        Map<Integer, Long> taskMap = new HashMap<>();

        long day = 0;
        for (int task : tasks) {
            //Now if the day is less than the whats in the taskMap,
            //Move the days so that we can execute the task
            if (day < taskMap.getOrDefault(task, 0l)) {
                day = taskMap.get(task);
            }
            day++;
            taskMap.put(task, day + space);
        }

        return day;
    }
}
