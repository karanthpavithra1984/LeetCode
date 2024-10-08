package easy.hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * For an even length palindrome, the number of occurances for each character is always even.
 * for an odd length palindrome,
 * the number of occurances for each character is even except one which might have one extra or there will be one extra character
 * Time Complexity o(n)
 * Space - Map worst case o(n) if its not a palindrome but less than o(n)
 *
 */

public class CanPermutatePalindrome {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> noOfOccurances = new HashMap<>();
        int oddOccurances = 0;
        for(Character character: s.toCharArray()){
           noOfOccurances.put(character, noOfOccurances.getOrDefault(character, 0) + 1);
           if(noOfOccurances.get(character) % 2 != 0 ){
               oddOccurances++;
           }else{
               oddOccurances--;
           }
        }
        //Odd Occurances is 0  - even palindrome, else odd length palindrome.
        return oddOccurances <= 1;
    }
}
