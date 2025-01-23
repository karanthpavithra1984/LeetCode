package easy.String;

public class MergeStringsAlternatively {

    /**
     * Time Complexity o(m+n) where m is word1 length and n is word2 length
     * Space Complexity o(m+n) the result space
     * @param word1
     * @param word2
     * @return
     */
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        int start1 = 0, start2 = 0;
        StringBuffer wordbuffer = new StringBuffer(len1 + len2);

        while (start1 < len1 || start2 < len2) {
            if(start1 < len1) wordbuffer.append(word1.charAt(start1));
            if(start2 < len2) wordbuffer.append(word2.charAt(start2));

            start1++;
            start2++;
        }

        return wordbuffer.toString();
    }
}
