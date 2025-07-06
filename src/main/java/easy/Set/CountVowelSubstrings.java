package easy.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Time Complexity n*(n-4) = n2
 * Space o(n)
 */

public class CountVowelSubstrings {
    public int countVowelSubstrings(String word) {
        Set<Character> vowels = new HashSet<>();
        int vowelSSCount = 0;
        //At the least the word substring should have all the vowels i.e 5
        for (int i = 0; i < word.length() - 4; i++) {
            vowels.clear();
            for (int j = i; j < word.length(); j++) {
                if (isVowel(word.charAt(j))) {
                    vowels.add(word.charAt(j));
                } else {
                    break;
                }
                if (vowels.size() == 5)
                    vowelSSCount++;
            }
        }

        return vowelSSCount;

    }

    private boolean isVowel(Character ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
