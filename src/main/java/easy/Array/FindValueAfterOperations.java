package easy.Array;

import java.util.HashMap;
import java.util.Map;

public class FindValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("X++", 1);
        map.put("X--", -1);
        map.put("++X",1);
        map.put("--X", -1);

        for(String op : operations){
            x += map.get(op);
        }

        return x;
    }
}
