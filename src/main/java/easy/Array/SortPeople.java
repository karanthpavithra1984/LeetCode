package easy.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> heightNameMap = new HashMap<>();
        for(int i=0; i < names.length; i++){
            heightNameMap.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] sortedNames = new String[names.length];

        for(int i = heights.length - 1; i >= 0 ; i--){
            sortedNames[heights.length - i - 1] = heightNameMap.get(heights[i]);
        }

        return sortedNames;
    }
}
