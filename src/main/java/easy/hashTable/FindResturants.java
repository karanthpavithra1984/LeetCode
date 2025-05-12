package easy.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindResturants {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            stringIntegerMap.put(list1[i], i);
        }

        int minIndexSum = Integer.MAX_VALUE;
        List<String> values = new ArrayList<>();
        for (int j = 0; j < list2.length; j++) {
            if (stringIntegerMap.containsKey(list2[j])) {
                int indexSum = stringIntegerMap.get(list2[j]) + j;
                if (indexSum == minIndexSum) {
                    values.add(list2[j]);
                } else if (indexSum < minIndexSum) {
                    values.clear();
                    values.add(list2[j]);
                    minIndexSum = indexSum;
                }
            }
        }


        return values.toArray(new String[values.size()]);

    }
}
