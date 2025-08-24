package easy.twopointers;

public class RevereWordInaString {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0, end = 0;
        while (start < s.length() && end < s.length()) {
            if (chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
            end++;
        }

        if (start < end) {
            reverse(chars, start, end - 1);
        }

        return new String(chars);

    }

    private void reverse(char[] chars, int i, int j) {
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
    }
}
