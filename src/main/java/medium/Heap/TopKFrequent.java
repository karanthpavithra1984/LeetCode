package medium.Heap;

import java.util.*;

public class TopKFrequent {
    //Anything top k, heap would be an ideal one to use


    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> wordFrequencyMap = new HashMap<>();
        for(String word: words){
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        //We need to push this in a descending order of the words and its count
        PriorityQueue<String> wordPriorityQueue = new PriorityQueue<>(
                (o1, o2) -> {
                    if(wordFrequencyMap.get(o1) == wordFrequencyMap.get(o2)){
                        return o2.compareTo(o1);
                    }else{
                        return wordFrequencyMap.get(o1) - wordFrequencyMap.get(o2);
                    }
                });

        for(String wordKey: wordFrequencyMap.keySet()){
            wordPriorityQueue.offer(wordKey);
            if(wordPriorityQueue.size() > k){
                wordPriorityQueue.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while(!wordPriorityQueue.isEmpty()){
            result.add(wordPriorityQueue.poll());
        }

        Collections.reverse(result);

        return result;
    }
}
