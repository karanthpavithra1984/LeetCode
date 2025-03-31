package medium.prefixsum;

import java.util.Arrays;
import java.util.List;

public class CountVowelInStrings {
    public int[] vowelStrings(String[] words, int[][] queries) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int[] prefixSum = new int[words.length];
        int totalSum = 0;
        //Calculate the prefix Sum
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))) {
                totalSum++;
            }
            prefixSum[i] = totalSum;
        }

        //Now get the arrays;
        int[] values = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int left = query[0] == 0 ? 0 : prefixSum[query[0]-1];
            values[i] = prefixSum[query[1]] - left;
        }

        return values;
    }
}
