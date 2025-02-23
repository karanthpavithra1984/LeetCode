package easy.String;

import java.util.HashSet;
import java.util.Set;

public class CheckIfPanagram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> charSet = new HashSet<Character>();
        for(char c : sentence.toCharArray()){
            charSet.add(c);
            if (charSet.size() == 26)
                return true;
        }

        return charSet.size() == 26;
    }
}
