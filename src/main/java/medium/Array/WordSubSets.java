package medium.Array;

import java.util.ArrayList;
import java.util.List;

public class WordSubSets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] max_req = new int[26];

        for (String word : words2) {
            int[] count = count(word);

            //Get the maximum count for each characters from all the word
            for (int i = 0; i < 26; i++) {
                max_req[i] = Math.max(max_req[i], count[i]);
            }
        }

        List<String> universalList = new ArrayList<>();
        for (String word : words1) {
            int[] count = count(word);

            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                //now if the characters are lower than what is required, then its not universal
                if (count[i] < max_req[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                universalList.add(word);
            }
        }

        return universalList;
    }

    private int[] count(String word) {
        int[] counter = new int[26];

        for (Character character : word.toCharArray()) {
            counter[character - 'a']++;
        }

        return counter;
    }
}
