package easy.Array;

public class isCircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] split = sentence.split(" ");
        String firstWord = split[0];
        char firstChar = firstWord.charAt(0);
        char lastChar = firstWord.charAt(firstWord.length() - 1);

        if (split.length == 1 && firstChar != lastChar) {
            return false;
        }
        for (int i = 1; i < split.length; i++) {
            String word = split[i];

            if (lastChar != word.charAt(0)) {
                return false;
            } else if (i == split.length - 1 && word.charAt(word.length() - 1) != firstChar) {
                return false;
            }

            lastChar = word.charAt(word.length() - 1);
        }

        return true;
    }
}
