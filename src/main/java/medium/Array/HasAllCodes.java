package medium.Array;

import java.util.HashSet;
import java.util.Set;

public class HasAllCodes {
    public boolean hasAllCodes(String s, int k) {
        int need = 1 << k;
        Set<String> uniqueCodes = new HashSet<>();

        for (int i = 0; i <= s.length() - k; i++) {
            uniqueCodes.add(s.substring(i, i + k));

            if (uniqueCodes.size() == need) {
                return true;
            }
        }

        return false;
    }
}
