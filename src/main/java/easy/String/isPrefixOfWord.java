package easy.String;

/**
 * Time Complexity - m is the number of patterns , n is the length of the string
 * Complexity of indexOf is o(m*n) + o(n) for split words + o(n) maximum if there are no space
 * So its aroung o(m*n)
 * <p>
 * Space compelxtiy splitWords = o(n) - maximum n
 */
public class isPrefixOfWord {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] splitWords = sentence.split(" ");
        for (int i = 0; i < splitWords.length; i++) {
            if (splitWords[i].indexOf(searchWord) == 0) {
                return i + 1;
            }
        }

        return -1;
    }
}
