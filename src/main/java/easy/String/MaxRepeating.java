package easy.String;

/**
 * Space Complexity
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
