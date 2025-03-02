package medium.twopointers;

public class PalindromicSubStrings {
    public int countSubStrings(String s) {
        //Refer to Longest Palindromic SubString
        //But for the number of substrings , check every , I meant loop through the string
        //Twice and then additional n space for checking the palindrome
        //O(n3)

        int totalCount = 0;

        //Check around centers

        for(int i = 0 ; i < s.length() ; i++) {
            //Odd
            totalCount += checkPalindrome(s, i, i);
            //eVEN
            totalCount += checkPalindrome(s, i, i + 1);
        }

        return totalCount;
    }

    private int checkPalindrome(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length()) {
            if(s.charAt(left) != s.charAt(right)) {
                break;
            }
            count++;
            left--;
            right++;
        }

        return count;
    }
}
