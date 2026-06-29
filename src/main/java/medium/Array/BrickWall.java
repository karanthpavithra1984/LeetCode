package medium.Array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> gaps = new HashMap<>();
        int maxGaps = 0;

        for(List<Integer> row: wall){
            //Dont count the edge Gap
            int currentPosition = 0;
            for(int i=0; i< row.size()-1; i++){
                currentPosition += row.get(i);

                int gapCount = gaps.getOrDefault(currentPosition, 0) + 1;
                gaps.put(currentPosition, gapCount);

                maxGaps = Math.max(maxGaps, gapCount);
            }
        }

        return wall.size() - maxGaps;

    }
}
