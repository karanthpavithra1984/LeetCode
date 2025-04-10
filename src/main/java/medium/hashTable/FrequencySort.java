package medium.hashTable;

import java.util.*;

public class FrequencySort {
    public String frequencySort(String s) {
        Map<Character, Integer> characterCountMap = new HashMap<>();

        for(Character character : s.toCharArray()){
            characterCountMap.put(character, characterCountMap.getOrDefault(character,0)+1);
        }

        Queue<Character> priorityQueue = new PriorityQueue<>(((o1, o2) -> characterCountMap.get(o2) - characterCountMap.get(o1)));
        priorityQueue.addAll(characterCountMap.keySet());

        StringBuilder stringBuilder = new StringBuilder();
        while(!priorityQueue.isEmpty()){
            Character character = priorityQueue.poll();
            int counter = characterCountMap.get(character);
            while(counter > 0){
                stringBuilder.append(character);
                counter--;
            }
        }

        return stringBuilder.toString();
    }
}
