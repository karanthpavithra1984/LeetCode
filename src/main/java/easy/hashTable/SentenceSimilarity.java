package easy.hashTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SentenceSimilarity {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if(sentence1.length != sentence2.length){
            return false;
        }
        Map<String, String> map = new HashMap<>();
        for(int i=0; i < sentence1.length; i++){
            if(!sentence1[i].equals(sentence2[i])) {
                map.put(sentence1[i], sentence2[i]);
            }
        }

        if(similarPairs.size() == 0 && map.size() == 0){
            return true;
        }

        System.out.println(map);

        for(List<String> pair: similarPairs){
            String pair1 = pair.get(0);
            String pair2 = pair.get(1);
            if(map.containsKey(pair1)){
                if(pair2.equals(map.get(pair1))){
                    map.remove(pair1);
                }
            }

            if(map.containsKey(pair2)){
                if(pair1.equals(map.get(pair2))){
                    map.remove(pair2);
                }
            }
        }

        return map.size() == 0;
    }
}
