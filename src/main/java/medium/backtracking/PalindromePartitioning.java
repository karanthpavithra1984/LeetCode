package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity N*2^N
 * Space complexity o(n)
 */

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        backtrack(s, result, 0, new ArrayList<>());

        return result;
    }

    private void backtrack(String s, List<List<String>> result, int index, List<String> comb){
        if(index >= s.length()){
            result.add(new ArrayList<>(comb));
            return;
        }

        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                comb.add(s.substring(index, i+1));
                backtrack(s, result, i+1, comb);
                comb.remove(comb.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String string, int left, int right){
        while(left<right){
            if(string.charAt(left) != string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
