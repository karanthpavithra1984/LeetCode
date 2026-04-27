package easy.Array;

import java.util.HashMap;
import java.util.Map;

public class isIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sCharMap = new HashMap<>();
        Map<Character, Integer> tCharMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            if(!sCharMap.containsKey(sChar)) {
                sCharMap.put(sChar, i);
            }

            if(!tCharMap.containsKey(tChar)) {
                tCharMap.put(tChar, i);
            }

            if(!sCharMap.get(sChar).equals(tCharMap.get(tChar))) {
                return false;
            }
        }

        return true;
    }
}
