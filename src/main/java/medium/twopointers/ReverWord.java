package medium.twopointers;

public class ReverWord {
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length - 1);

        reverseWord(s);
    }

    private void reverseWord(char[] s) {
        int left = 0;
        int right = 0;
        while (left < s.length) {
            while (right < s.length && s[right] != ' ')
                right++;
            reverse(s, left, right - 1);
            left = right + 1;
            right = left;

        }
    }

    private void reverse(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
