package medium.String;

/**
 * Space complexity - o(n) - we use it only for boolean array
 * Time complexity -
 * n = s.length
 * k = word.length
 * m = number of words
 * <p>
 * <p>
 * indexOf is called (n-k) times - and indexOf itself for each word would be o(n*k) - o(n^2*k - k^2*n)
 * And we call it for m words - so o(m((n^2*k - k^2*n)))
 */

public class AddBoldToTag {
    public String addBoldTag(String s, String[] words) {
        boolean[] isBold = new boolean[s.length()];
        for (String word : words) {
            int start = s.indexOf(word);
            while (start >= 0) {
                //Make each character bold
                for (int i = start; i < start + word.length(); i++) {
                    isBold[i] = true;
                }

                //look for next match starting with next index
                start = s.indexOf(word, start + 1);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int j = 0; j < s.length(); j++) {
            //Add opening tag if the current character is bold and previous one is not or if its the first character
            if (isBold[j] && (j == 0 || !isBold[j - 1])) {
                stringBuilder.append("<b>");
            }
            stringBuilder.append(s.charAt(j));

            if (isBold[j] && (j == s.length() - 1 || !isBold[j + 1])) {
                stringBuilder.append("</b>");
            }
        }

        return stringBuilder.toString();
    }
}
