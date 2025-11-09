package medium.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitBasket {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0;

        while(left < fruits.length && right < fruits.length) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            if(map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            right++;
        }

        return right-left;
    }
}
