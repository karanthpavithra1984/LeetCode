package easy.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonFromSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1String = s1.split(" ");
        String[] s2String = s2.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for(String s: s1String){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String s: s2String){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> res = new ArrayList<>();
        for(String s: map.keySet()){
            if(map.get(s) == 1){
                res.add(s);
            }
        }

        return res.toArray(new String[0]);
    }
}
