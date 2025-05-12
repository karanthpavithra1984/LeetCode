package easy.String;

public class FindTheDifference {
    /**
     * Time Complexity o(2n)
     * Space Complexity o(1)
     *
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            chars[t.charAt(i) - 'a']--;
            if (chars[t.charAt(i) - 'a'] == -1) {
                return t.charAt(i);
            }
        }

        return t.charAt(0);
    }
}
