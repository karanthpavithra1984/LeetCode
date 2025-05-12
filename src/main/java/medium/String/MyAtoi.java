package medium.String;

public class MyAtoi {
    /**
     * Time Complexity o(n)
     * Space Complexity o(1)
     *
     * @param s
     * @return
     */
    public int myAtoi(String s) {
        int sign = 1;
        int result = 0;
        int index = 0;
        int length = s.length();

        //Remove the trailing space
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }


        if (index >= length) {
            return result;
        }

        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            sign = 1;
            index++;
        }

        while (index < length) {
            if (!Character.isDigit(s.charAt(index))) {
                return result;
            }

            int digit = s.charAt(index) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;

            index++;
        }


        return sign * result;


    }
}
