package medium.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Time Complexity 4^n * n
 * 4 is because for 7 & 9 there are 4 characters , so we will have to split to 4 branches.
 *
 */

public class LetterCombinations {
    private static Map<Integer, String> numberMap = new HashMap<>();
    static {
        numberMap.put(2,"abc");
        numberMap.put(3,"def");
        numberMap.put(4,"ghi");
        numberMap.put(5,"jkl");
        numberMap.put(6,"mno");
        numberMap.put(7,"pqrs");
        numberMap.put(8,"tuv");
        numberMap.put(9,"wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;

        backTrack(digits, res, new StringBuilder(), 0);
        return res;
    }

    private void backTrack(String digits, List<String> res, StringBuilder sb, int index) {
        if(sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }

        String possibleValues = numberMap.get(digits.charAt(index)- '0');
        for(Character character: possibleValues.toCharArray()){
            sb.append(character);
            backTrack(digits, res, sb, index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
