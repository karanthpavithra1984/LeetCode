package medium.Array;

import java.util.HashSet;
import java.util.Set;

public class UniqueLength3PalindromeSubSequence {
    public int countPalindromicSubsequence(String s) {
        int answer = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            int first = s.indexOf(i);
            int last = s.lastIndexOf(i);

            if (last - first > 1) {

                //Find the unique characters using the hashSet between first and last
                Set<Character> values = new HashSet<>();
                for (int j = first + 1; j < last; j++) {
                    values.add(s.charAt(j));
                }

                answer += values.size();
            }
        }
        return answer;
    }
}
