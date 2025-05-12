package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Time 2 to the power of k
 * Space 2 to the power of k
 */

public class GetHappyString {
    public String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generateHappyStrings(n, k, sb, happyStrings);

        if (happyStrings.size() < k) {
            return "";
        }

        return happyStrings.get(happyStrings.size() - 1);
    }

    private void generateHappyStrings(int n, int k, StringBuilder sb, List<String> happyStrings) {
        if (sb.length() == n) {
            happyStrings.add(sb.toString());
            return;
        }


        for (char curChar = 'a'; curChar <= 'c'; curChar++) {
            //Cannot have same characters
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == curChar) {
                continue;
            }

            if (happyStrings.size() >= k) {
                break;
            }

            sb.append(curChar);
            generateHappyStrings(n, k, sb, happyStrings);
            sb.setLength(sb.length() - 1);
        }
    }
}
