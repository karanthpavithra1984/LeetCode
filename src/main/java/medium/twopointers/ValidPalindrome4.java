package medium.twopointers;

public class ValidPalindrome4 {

    /**
     * Time Complexity - o(n)
     * Space Complexity - o(1)
     * @param s
     * @return
     */
    public boolean makePalindrome(String s) {

        int leftindex = 0, rightindex = s.length() - 1;
        int count = 0;

        while(leftindex < rightindex){
            if(s.charAt(leftindex) != s.charAt(rightindex)){
                count++;
            }

            if(count > 2){
                return false;
            }

            leftindex++;
            rightindex--;
        }

        return true;
    }
}
