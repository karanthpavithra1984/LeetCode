package medium.Array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LongestHappyString {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> -o[1]));

        if(a> 0){
            queue.add(new int[]{'a',a});
        }
        if(b > 0){
            queue.add(new int[]{'b',b});
        }
        if(c > 0){
            queue.add(new int[]{'c',c});
        }

        StringBuilder stringBuilder = new StringBuilder();
        while(!queue.isEmpty()){
            int[] first = queue.poll();
            char firstChar = (char) first[0];

            if(stringBuilder.toString().endsWith(String.valueOf(firstChar).repeat(2))){
                if(queue.isEmpty()){
                    break;
                }
                //Just append the next character
                int[] second = queue.poll();
                stringBuilder.append((char)second[0]);
                second[1]--;

                if(second[1] > 0) queue.offer(second);
            }else{
                stringBuilder.append(firstChar);
                first[1]--;
                if(first[1] > 0 ) queue.offer(first);
            }

        }

        return stringBuilder.toString();
    }
}
