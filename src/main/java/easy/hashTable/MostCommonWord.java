package easy.hashTable;

import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[!?',;.\\s]+");

        Map<String, Integer> map = new HashMap<>();
        int maxValue = 0;
        String maxWord = "";
        List<String> bannedList = Arrays.asList(banned);

        for(String word : words){
            if(bannedList.contains(word)){
                continue;
            }
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }

            if(maxValue < map.get(word)){
                maxValue = map.get(word);
                maxWord = word;
            }
        }

        return maxWord;
    }
}
