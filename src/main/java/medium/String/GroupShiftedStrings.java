package medium.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupShiftedStrings {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> hashGroup = new HashMap<>();

        for (String str : strings) {
            String hash = getHash(str);
            if (!hashGroup.containsKey(hash)) {
                hashGroup.put(hash, new ArrayList<>());
            }
            hashGroup.get(hash).add(str);
        }

        return hashGroup.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
    }

    private String getHash(String str) {
        StringBuilder hash = new StringBuilder();
        int firstChar = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            int diff = str.charAt(i) - firstChar;
            if (diff < 0)
                diff += 26;

            hash.append(diff + ":");
        }

        return hash.toString();
    }
}
