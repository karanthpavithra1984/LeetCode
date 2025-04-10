package medium.hashTable;

import java.util.*;

public class FrequencySortBucket {
    public String frequencySort(String s) {
        Map<Character, Integer> characterCountMap = new HashMap<>();

        for(Character character : s.toCharArray()){
            characterCountMap.put(character, characterCountMap.getOrDefault(character,0)+1);
        }

        int maxValue = characterCountMap.values().stream().mapToInt(x -> x).max().getAsInt();

        List<List<Character>> bucketList = new ArrayList<>();
        for(int i=0; i <= maxValue; i++){
            bucketList.add(new ArrayList<>());
        }

        for(Character key: characterCountMap.keySet()){
            bucketList.get(characterCountMap.get(key)).add(key);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i= bucketList.size()-1; i >=0 ;i--){
            for (Character c : bucketList.get(i)) {
              int counter = i;

              while(counter > 0){
                  stringBuilder.append(c);
                  counter--;
              }
            }
        }

        return stringBuilder.toString();
    }
}
