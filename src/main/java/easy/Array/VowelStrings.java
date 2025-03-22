package easy.Array;

public class VowelStrings {
    public int vowelStrings(String[] words, int left, int right) {
        final String VOWELS = "aeiou";
        int count = 0;
        for(int i=left ;i <= right; i++){
            if(VOWELS.contains(words[i].charAt(0) + "")
                    && VOWELS.contains(words[i].charAt(words[i].length()-1) + "")){
               count++;
            }
        }

        return count;
    }
}
