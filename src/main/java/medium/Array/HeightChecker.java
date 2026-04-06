package medium.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sortedArray = bubbleSort(heights);
        int count = 0;
        for(int i= 0; i< heights.length; i++){
            if(sortedArray[i] != heights[i]){
                count++;
            }
        }

        return count;
    }

    private int[] bubbleSort(int[] heights){
        int[] sortedArray = new int[heights.length];
        int minValue = Arrays.stream(heights).min().getAsInt();
        int maxValue = Arrays.stream(heights).max().getAsInt();

        Map<Integer, Integer> valueMap = new HashMap<>();
        for(int height: heights){
            valueMap.put(height, valueMap.getOrDefault(height,0) + 1);
        }

        int index = 0;
        for(int i= minValue; i <= maxValue; i++){
            while(valueMap.getOrDefault(i,0) > 0){
                sortedArray[index] = i;
                index++;
                valueMap.put(i, valueMap.get(i) - 1);
            }
        }


        return sortedArray;
    }
}
