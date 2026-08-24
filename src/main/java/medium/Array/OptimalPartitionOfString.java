package medium.Array;

import java.util.HashMap;
import java.util.Map;

public class OptimalPartitionOfString {
    public int partitionString(String s) {
        Map<Character, Integer> position = new HashMap<>();
        int count = 1, subStringStart = 0;

        for(int i= 0; i < s.length(); i++){
            Character character = s.charAt(i);
            //Found a duplicate
            if(position.containsKey(character) && position.get(character) >= subStringStart ){
                count++;
                subStringStart = i;
            }

            position.put(s.charAt(i), i);
        }

        return count;
    }
}
