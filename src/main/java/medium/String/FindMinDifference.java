package medium.String;

import java.util.Arrays;
import java.util.List;

public class FindMinDifference {
    public int findMinDifference(List<String> timePoints) {
        int[] timePointList = new int[timePoints.size()];

        for (int i = 0; i < timePoints.size(); i++) {
            String timePoint = timePoints.get(i);
            int minutes = Integer.parseInt(timePoint.substring(0, 2)) * 60
                    + Integer.parseInt(timePoint.substring(3));
            timePointList[i] = minutes;
        }

        Arrays.sort(timePointList);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < timePointList.length - 1; i++) {
            ans = Math.min(ans, Math.abs(timePointList[i] - timePointList[i + 1]));
        }

        return Math.min(ans, 24*60 - timePointList[timePointList.length - 1] - timePointList[0]);

    }

}
