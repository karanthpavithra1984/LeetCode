package easy.hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * For an even length palindrome, the number of occurances for each character is always even.
 * for an odd length palindrome,
 * the number of occurances for each character is even except one which might have one extra or there will be one extra character
 * Time Complexity o(n)
 * Space - Map worst case o(n) if its not a palindrome but less than o(n)
 */

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> characterOccurances = new HashMap<>();
        int numOfOddoCC = 0;
        for (Character character : s.toCharArray()) {
            characterOccurances.put(character, characterOccurances.getOrDefault(character, 0) + 1);
            if (characterOccurances.get(character) % 2 != 0) {
                numOfOddoCC++;
            } else {
                numOfOddoCC--;
            }
        }

        //In case of odd length palindrome , we need only one extra character,hence substract length - numofodd + 1
        //if not odd length  , the string is palindrome.
        return numOfOddoCC > 0 ? s.length() - numOfOddoCC + 1 : s.length();
    }
}
