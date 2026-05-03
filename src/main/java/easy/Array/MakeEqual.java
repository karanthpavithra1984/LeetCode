package easy.Array;

public class MakeEqual {
    public boolean makeEqual(String[] words) {
        int[] charCount = new int[26];

        for (String word : words) {
            for (Character c : word.toCharArray()) {
                charCount[c - 'a']++;
            }
        }

        int n = words.length;
        for (int charC : charCount) {
            if (charC % n != 0) {
                return false;
            }
        }

        return true;
    }
}
