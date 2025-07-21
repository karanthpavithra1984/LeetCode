package easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : licensePlate.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        String answer = "";

        for (int i = 0; i < words.length; i++) {
            boolean found = true;
            if (answer.length() > 0 && answer.length() <= words[i].length()) {
                //Return the latest answer , so only proceed if the answer is length is greater
                continue;
            }

            Map<Character, Integer> map1 = new HashMap<>();
            for (Character character : words[i].toCharArray()) {
                if (Character.isAlphabetic(character)) {
                    map1.put(character, map1.getOrDefault(character, 0) + 1);
                }
            }

            for (Character key : map.keySet()) {
                if (map1.getOrDefault(key, 0) < map.get(key)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                answer = words[i];
            }
        }
        return answer;
    }
}
