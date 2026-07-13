package medium.Array;

import java.util.HashMap;
import java.util.Map;

public class InterchangeableRectangles {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Integer> ratioMap = new HashMap<>();

        long totalCount = 0;

        for(int[] rectangle : rectangles){
            double value = (double)rectangle[0]/rectangle[1];

            if(ratioMap.containsKey(value)){
                totalCount += ratioMap.get(value);
            }

            ratioMap.put(value, ratioMap.getOrDefault(value,0) + 1);
        }

        return totalCount;
    }
}
