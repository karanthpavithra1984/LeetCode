package medium.hashTable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        Set<String> dictSet = new HashSet<>(dictionary);

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            boolean found = false;
            StringBuilder characterBuilder = new StringBuilder();
            for (Character character : word.toCharArray()) {
                characterBuilder.append(character);
                if (dictSet.contains(characterBuilder.toString())) {
                    stringBuilder.append(characterBuilder + " ");
                    found = true;
                    break;
                }
            }

            if (!found) {
                stringBuilder.append(word + " ");
            }
        }

        return stringBuilder.toString().trim();
    }
}
