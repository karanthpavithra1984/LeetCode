package easy.String;

public class GoatLatin {
    /**
     * Using stringbuilder might reduce some time complexity
     * o(n2)
     *
     * @param sentence
     * @return
     */
    public String toGoatLatin(String sentence) {
        String VOWELS = "aeiouAEIOU";
        String APPEND_STRING = "ma";
        StringBuilder result = new StringBuilder();
        StringBuilder suffix = new StringBuilder();
        //o(n) - Split takes o(n)
        for (String word : sentence.split(" ")) {
            suffix.append('a');
            Character c = word.charAt(0);
            //Considering worst case where all the characters are non vowels, substring takes o(n)
            //Since it has to create a new string
            if (VOWELS.indexOf(c) == -1) {
                //o(n)
                result.append(word.substring(1)).append(c).append(APPEND_STRING).append(suffix);
            } else {
                result.append(word).append(APPEND_STRING).append(suffix);
            }

            result.append(' ');
        }

        return result.toString().trim();
    }
}
