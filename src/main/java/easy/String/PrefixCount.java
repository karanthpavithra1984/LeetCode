package easy.String;

/**
 * Time complexity o(number of length of words * length of word * length of perf)
 * Space Complexity o(1)
 */
public class PrefixCount {
    public int prefixCount(String[] words, String pref) {
        int prefCount = 0;
        for (String word : words) {
            if (word.indexOf(pref) == 0) {
                prefCount++;
            }
        }

        return prefCount;
    }
}
