package medium.Stack;

import java.util.List;
import java.util.Stack;

public class ExclusiveTime {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> processId = new Stack<>();
        int prev = 0;
        int[] result = new int[n];
        for(String log: logs){
            String[] parts = log.split(":");
            if(parts[1].equals("start")){
                if(!processId.isEmpty()){
                    result[processId.peek()] += Integer.parseInt(parts[2]) - prev;
                }
                processId.push(Integer.parseInt(parts[0]));
                prev = Integer.parseInt(parts[2]);
            }else{
                int id = processId.pop();
                int total = Integer.parseInt(parts[2]) + 1;
                result[id] += total - prev;
                prev = total;
            }
        }

        return result;
    }
}
