package medium.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            String transString = transformString(s);
            if (!anagrams.containsKey(transString)) {
                anagrams.put(transString, new ArrayList<>());
            }
            anagrams.get(transString).add(s);
        }


        return new ArrayList<>(anagrams.values());
    }

    private String transformString(String str) {
        int[] charArray = new int[26];

        for (int i = 0; i < str.length(); i++) {
            charArray[str.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 0) {
                sb.append(charArray[i]);
                sb.append("times -> " + i);
            }
        }

        return sb.toString();
    }
}
