package hard.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlienDictionary {
    public String alienOrder(String[] words) {
        Map<Character, List<Character>> adjacencyList = new HashMap<>();

        Map<Character, Boolean> visited = new HashMap<>();
        Map<Character, Boolean> inPath = new HashMap<>();

        for (String word : words) {
            for (Character c : word.toCharArray()) {
                adjacencyList.putIfAbsent(c, new ArrayList<>());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            int minLength = Math.min(word1.length(), word2.length());

            //If the current word is greater than next word and
            // word1 startsWith word2
            //Return empty string
            if (word1.length() > word2.length() && word1.startsWith(word2)) {
                return "";
            }

            for (int j = 0; j < minLength; j++) {
                //If not equal add to the adj list
                if (word1.charAt(j) != word2.charAt(j)) {
                    adjacencyList.get(word1.charAt(j)).add(word2.charAt(j));
                    break;
                }
            }
        }

        for (Character ch : adjacencyList.keySet()) {
            if (!dfs(adjacencyList, ch, visited, inPath, sb)) {
                return "";
            }
        }

        return sb.reverse().toString();
    }

    private boolean dfs(Map<Character, List<Character>> adjacenyList, Character ch, Map visited, Map inPath, StringBuilder sb) {
        if (inPath.containsKey(ch)) {
            return false;
        }

        if (visited.containsKey(ch)) {
            return true;
        }

        visited.put(ch, true);
        inPath.put(ch, true);

        for (Character neighbor : adjacenyList.get(ch)) {
            if (!dfs(adjacenyList, neighbor, visited, inPath, sb)) {
                return false;
            }
        }

        inPath.remove(ch);
        sb.append(ch);
        return true;
    }
}
