package medium.backtracking;

import java.util.HashMap;
import java.util.Map;

public class LetterTilePossibilities {

    /**
     * Time Complexity:
     * Worst Case (O(n!))
     * If all letters are unique, we generate n! sequences (like full permutations).
     * Best Case (O(n))
     * If all letters are identical (e.g., "AAAAA"), the function only makes O(n) calls.
     * In practical cases, the complexity is somewhere between O(n) and O(n!), depending on the number of duplicate letters.
     * Space Complexity:
     * O(n) for the recursion call stack.
     * O(1) extra space, since the frequency map is limited to at most 26 letters (constant space).
     */

    Map<Character, Integer> characterCount = new HashMap<>();

    public int numTilePossibilities(String tiles) {
        //Count the frequency
        for (Character c : tiles.toCharArray()) {
            characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
        }

        return backTrack();
    }

    private int backTrack() {
        int result = 0;

        for (Character c : characterCount.keySet()) {
            if (characterCount.get(c) > 0) {
                characterCount.put(c, characterCount.get(c) - 1);
                result += 1; //The characters
                result += backTrack();
                characterCount.put(c, characterCount.get(c) + 1);
            }
        }


        return result;
    }
}
