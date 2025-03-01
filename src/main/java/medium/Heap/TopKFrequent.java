package medium.Heap;

import java.util.*;

public class TopKFrequent {
    //Anything top k, heap would be an ideal one to use


    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> wordFrequencyMap = new HashMap<>();
        for(String word: words){
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        //The priority queue is ascending in nature
        // So we need to sort ascending and then if the numbers are equal , sort them by
        //Non lexiographical

        PriorityQueue<String> wordPriorityQueue = new PriorityQueue<>(
                (o1, o2) -> {
                    if(wordFrequencyMap.get(o1) == wordFrequencyMap.get(o2)){
                        return o1.compareTo(o2);
                    }else{
                        return wordFrequencyMap.get(o1) - wordFrequencyMap.get(o2);
                    }
                });

        for(String wordKey: wordFrequencyMap.keySet()){
            wordPriorityQueue.offer(wordKey);
        }

        List<String> result = new ArrayList<>();
        while(!wordPriorityQueue.isEmpty()){
            result.add(wordPriorityQueue.poll());
        }

        Collections.reverse(result);

        return result;
    }
}
