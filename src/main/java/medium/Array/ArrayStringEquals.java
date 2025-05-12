package medium.Array;

public class ArrayStringEquals {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("", word1);

        int index = 0;

        for (String word : word2) {
            for (Character character : word.toCharArray()) {
                if (index >= str1.length() || character != str1.charAt(index)) {
                    return false;
                }

                index++;
            }
        }

        return index == str1.length();
    }
}
