package easy.Array;

public class CalculateTime {
    public int calculateTime(String keyboard, String word) {
        int[] alphabet = new int[26];

        for(int i=0 ; i < keyboard.length(); i++){
            //Store the index
            alphabet[keyboard.charAt(i) - 'a'] = i;
        }

        int prevIndex = 0;
        int total = 0;
        for(int i=0 ; i < word.length(); i++ ){
            int nextIndex = alphabet[word.charAt(i) - 'a'];
            total += Math.abs(nextIndex - prevIndex);
            prevIndex = nextIndex;
        }

        return total;
    }
}
