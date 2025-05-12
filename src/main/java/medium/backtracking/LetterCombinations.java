package medium.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Time Complexity 4^n * n
 * 4 is because for 7 & 9 there are 4 characters , so we will have to split to 4 branches.
 */

public class LetterCombinations {
    private static Map<Integer, String> numberMap = new HashMap<>();

    static {
        numberMap.put(2, "abc");
        numberMap.put(3, "def");
        numberMap.put(4, "ghi");
        numberMap.put(5, "jkl");
        numberMap.put(6, "mno");
        numberMap.put(7, "pqrs");
        numberMap.put(8, "tuv");
        numberMap.put(9, "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;

        backtrack(digits, 0, res, new StringBuilder());
        return res;
    }

    private void backtrack(String digits, int index, List<String> result, StringBuilder stringBuilder) {
        if (index == digits.length()) {
            result.add(stringBuilder.toString());
            return;
        }

        String characters = numberMap.get(digits.charAt(index) - '0');

        for (Character character : characters.toCharArray()) {
            stringBuilder.append(character);
            backtrack(digits, index + 1, result, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

}
