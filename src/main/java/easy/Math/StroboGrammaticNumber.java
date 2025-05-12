package easy.Math;

import java.util.Map;

public class StroboGrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = Map.of('0', '0', '1', '1',
                '6', '9', '8', '8', '9', '6');

        StringBuilder sb = new StringBuilder();
        for (Character character : num.toCharArray()) {
            if (!map.containsKey(character)) {
                return false;
            }

            sb.append(map.get(character));
        }

        return sb.reverse().toString().equals(num);


    }
}
