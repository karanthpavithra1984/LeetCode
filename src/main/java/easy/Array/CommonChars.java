package easy.Array;

import java.util.*;

public class CommonChars {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> commonChars = new HashMap<>();

        for (Character character : words[0].toCharArray()) {
            commonChars.put(character, commonChars.getOrDefault(character, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentChars = new HashMap<>();
            for (Character character : words[i].toCharArray()) {
                currentChars.put(character, currentChars.getOrDefault(character, 0) + 1);
            }

            for (Character key : new HashSet<>(commonChars.keySet())) {
                if (currentChars.containsKey(key)) {
                    commonChars.put(key, Math.min(currentChars.get(key), commonChars.get(key)));
                } else {
                    commonChars.remove(key);
                }
            }
        }

        List<String> returnList = new ArrayList<>();

        for (Character key : commonChars.keySet()) {
            int freq = commonChars.get(key);

            while (freq > 0) {
                returnList.add(key + "");
                freq--;
            }
        }

        return returnList;
    }
}
