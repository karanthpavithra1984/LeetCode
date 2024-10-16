package easy.String;

/**
 * Space Complexity sequence length if the whole sequence has repeating words
 * Time Complexity - o(sequence/word) - if the whole sequence has repeating words
 */
public class MaxRepeating {
    public int maxRepeating(String sequence, String word) {
        int maxRepeat = 0;
        String repeat = word;

        while(sequence.contains(repeat)){
            maxRepeat++;
            repeat += word;
        }

        return maxRepeat;
    }
}
