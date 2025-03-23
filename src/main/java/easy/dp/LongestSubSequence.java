package easy.dp;

import java.util.ArrayList;
import java.util.List;

public class LongestSubSequence {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int current = groups[0];
        List<String> values = new ArrayList<>();
        values.add(words[0]);

        for(int i = 1; i < words.length; i++){
            if(groups[i] != current){
                values.add(words[i]);
            }

            current = groups[i];
        }

        return values;
    }
}
