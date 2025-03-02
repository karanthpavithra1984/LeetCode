package medium.twopointers;

public class LongestPalindromicSubString {
    /*
    Time Complexity o(n2)
    Space o(1)
     */
    private int longest = 0;
    private String longestSubString = "";
    //Brute force is going to be check each substring byt decreasing the length
    //So that would be outer loop to reduce the right pointer
    //Inner loop to reduce the left pointer
    //Then using two pointers to check the palindrome
    //This can be reduced by saving the strings which are already checked in a hashmap
    public String longestPalindrome(String s) {
        //Second approach is to extend over the center
        longest = 0;
        longestSubString = "";
        for(int i = 0; i < s.length(); i++) {
            //odd and even
           checkPalindrome(s, i, i);
           checkPalindrome(s,i,i+1);
        }

        return longestSubString;
    }

    private void checkPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if(s.charAt(left) != s.charAt(right)) {
                break;
            }

            if(right-left+1 > longest){
                longest = right-left+1;
                longestSubString = s.substring(left, right+1);
            }
            left--;
            right++;
        }
    }
}
