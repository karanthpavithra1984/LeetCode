package easy.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindShortestToCharacter {
    public int[] shortestToChar(String s, char c) {
        List<Integer> indices = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                indices.add(i);
            }
        }

        int[] returnArray = new int[s.length()];
        Arrays.fill(returnArray, Integer.MAX_VALUE);
        for(int i = 0; i < s.length(); i++) {
            for(int index : indices) {
                returnArray[i] = Math.min(returnArray[i], Math.abs(i - index));
            }
        }

        return returnArray;
    }
}
