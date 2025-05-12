package easy.Array;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        int[] characters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            characters[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (characters[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
