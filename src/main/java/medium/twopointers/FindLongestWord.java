package medium.twopointers;

import java.util.List;

public class FindLongestWord {
    public String findLongestWord(String s, List<String> dictionary) {
        String maxWord = "";
        for (String word : dictionary) {
            if (isSubstring(s, word)) {
                if (maxWord.length() < word.length()) {
                    maxWord = word;
                } else if (maxWord.length() == word.length() && maxWord.compareTo(word) > 0) {
                    maxWord = word;
                }
            }
        }

        return maxWord;
    }

    private boolean isSubstring(String s, String dictionary) {
        int pt1 = 0, pt2 = 0;
        while (pt1 < s.length() && pt2 < dictionary.length()) {
            if (s.charAt(pt1) == dictionary.charAt(pt2)) {
                pt2++;
            }
            pt1++;

        }

        return pt2 == dictionary.length();
    }
}
