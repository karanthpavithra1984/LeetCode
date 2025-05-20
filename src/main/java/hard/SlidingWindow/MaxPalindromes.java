package hard.SlidingWindow;

public class MaxPalindromes {
    int start = 0;

    public int maxPalindromes(String s, int k) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            answer += isPalindrome(i, i, s, k);
            answer += isPalindrome(i, i + 1, s, k);
        }
        return answer;
    }

    private int isPalindrome(int left, int right, String s, int k) {
        int count = 0;
        while (left >= start && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                return 0;
            }
            if (right - left + 1 >= k) {
                count++;
                start = right + 1;
                break;
            }
            left--;

            right++;
        }

        return count;
    }

}
