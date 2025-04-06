package easy.hashTable;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candies = new HashSet<>();

        for (int candy : candyType) {
            candies.add(candy);
        }

        int number = candyType.length / 2;

        return number > candies.size() ? candies.size() : number;
    }
}
