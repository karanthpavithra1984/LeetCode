package medium.twopointers;

import java.util.ArrayList;
import java.util.List;

public class CamelMatch {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for (String query : queries) {
            ans.add(isCamelMatch(query, pattern));
        }

        return ans;
    }

    private boolean isCamelMatch(String query, String pattern) {
        int patterIndex = 0, queryIndex = 0;
        for (int i = 0; i < query.length(); i++) {
            if (patterIndex < pattern.length() && query.charAt(i) == pattern.charAt(patterIndex)) {
                patterIndex++;
            } else if (query.charAt(i) >= 'A' && query.charAt(i) <= 'Z') {
                return false;
            }
        }

        return patterIndex == pattern.length();
    }
}
