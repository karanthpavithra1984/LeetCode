package medium.hashTable;

import java.util.HashSet;
import java.util.Set;

public class LongestWord {
    public String longestWord(String[] words) {
        Set<String> wordSet = new HashSet<>();

        for(String word: words){
            wordSet.add(word);
        }

        String ans = "";

        for(String word: words){
            boolean found = true;
            StringBuilder stringBuilder = new StringBuilder();
            for(Character character: word.toCharArray()){
                stringBuilder.append(character);
                if(!wordSet.contains(stringBuilder.toString())){
                    found= false;
                    break;
                }
            }

            if(found){
                if(ans.length() < word.length() || ans.length() == word.length() && ans.compareTo(word) > 0)
                    ans = word;
            }

        }

        return ans;
    }
}
