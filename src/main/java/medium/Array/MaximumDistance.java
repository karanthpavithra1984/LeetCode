package medium.Array;

import java.util.List;

/**
 * Time Complexity arrays.size
 * Space complexity o(1)
 */

public class MaximumDistance {
    public int maxDistance(List<List<Integer>> arrays) {
        int minValue = arrays.get(0).get(0);
        int maxValue = arrays.get(0).get(arrays.get(0).size()-1);

        int maximumDistance = 0;

        for(int i=1; i<arrays.size(); i++){
            int currentMin = arrays.get(i).get(0);
            int currentMax = arrays.get(i).get(arrays.get(i).size()-1);

            maximumDistance = Math.max(maximumDistance, Math.max(Math.abs(currentMax - minValue),
                    Math.abs(maxValue- currentMin)));

            minValue = Math.min(minValue,currentMin);
            maxValue = Math.max(currentMax, maxValue);

        }

        return maximumDistance;
    }
}
