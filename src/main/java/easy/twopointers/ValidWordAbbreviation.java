package easy.twopointers;

public class ValidWordAbbreviation {

    /**
     * Time Complexity o(length of abbr)
     * @param word
     * @param abbr
     * @return
     */
    public boolean validWordAbbreviation(String word, String abbr) {
        int abbrIndex = 0;
        int wordIndex = 0;
        int num = 0;

        while (abbrIndex < abbr.length()) {
            char character = abbr.charAt(abbrIndex);
            //If num is o , its first charact is 0 then return false;
            if(num == 0 && character == '0') return false;
            if (Character.isDigit(character)) {
                num = num * 10 + character - '0';
                abbrIndex++;
            } else {
                wordIndex += num;
                if (wordIndex >= word.length() || word.charAt(wordIndex) != abbr.charAt(abbrIndex)) {
                    return false;
                }
                num = 0;
                abbrIndex++;
                wordIndex++;
            }
        }

        // Add the remaining index - edge case when there is number in the last.
        if (num > 0)
            wordIndex += num;
        return wordIndex == word.length();
    }

}
