package easy.Array;

import java.util.List;

/**
 * Time complexity - o(n * m) - n is the number of words, m is the number of characters
 * Space Complexity o(1)
 */

public class ValidWordSquare {
    public boolean validWordSquare(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            for (int charpos = 0; charpos < words.get(i).length(); charpos++) {
                if (charpos >= words.size() || i >= words.get(charpos).length()
                        || words.get(i).charAt(charpos) != words.get(charpos).charAt(i))
                    return false;
            }
        }

        return true;
    }
}
