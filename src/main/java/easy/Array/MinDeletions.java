package easy.Array;

import java.util.Arrays;

public class MinDeletions {
    public int minDeletion(String s, int k) {
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        Arrays.sort(charCount);
        int count = 0;

        for(int i =0; i < 26-k; i++){
            if(charCount[i] > 0) {
                count += charCount[i];
            }

        }

        return count;
    }
}
