package medium.String;

public class MyAtoi {
    /**
     * Time Complexity o(n)
     * Space Complexity o(1)
     * @param s
     * @return
     */
    public int myAtoi(String s) {int result = 0;
        int sign = 1;

        int index = 0;
        int len = s.length();
        //first take care of white spaces
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        if (index < len) {
            if (s.charAt(index) == '-') {
                sign = -1;
                index++;
            } else if (s.charAt(index) == '+') {
                sign = 1;
                index++;
            }
        }

        while (index < len) {
            if (!Character.isDigit(s.charAt(index)))
                break;

           int digit = (s.charAt(index) - '0');

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            index++;

            result = result * 10 + digit;
        }

        return sign * result;
    }
}
