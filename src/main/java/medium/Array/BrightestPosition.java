package medium.Array;

import java.util.Map;
import java.util.TreeMap;

public class BrightestPosition {
    public int brightestPosition(int[][] lights) {
        TreeMap<Integer, Integer> brightness = new TreeMap<>();

        for(int[] light: lights){
            int start = light[0] - light[1];
            int end = light[0] + light[1] + 1; //Brightness stays on the light[0] + light[1], but ends on +1;

            brightness.put(start, brightness.getOrDefault(start, 0) + 1);
            brightness.put(end , brightness.getOrDefault(end, 0)-1); // Ends here , so -1
        }

        int currentBrightness = 0 ;
        int maxBrightness = 0 ;
        int earliestBrightSpot = 0;

        for(Map.Entry<Integer, Integer> bright : brightness.entrySet()){
                currentBrightness += bright.getValue();

                if(currentBrightness > maxBrightness){
                    maxBrightness = currentBrightness;
                    earliestBrightSpot = bright.getKey();
                }
        }

        return earliestBrightSpot;
    }
}
