package easy.Math;

/**
 * Time Complexity o(Max(len(num1), len(num2))
 * Space Complexity o(n)
 */

public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        int carry = 0;
        while(len1 >= 0 || len2 >= 0) {
            int value1 = len1 >=0 ? (num1Array[len1] - '0'): 0;
            int value2 = len2 >= 0 ? (num2Array[len2] - '0'): 0;
            int value =  value1 + value2 + carry;
            int remainder = value % 10;
            carry = value / 10;
            result.append(remainder);
            len1--;
            len2--;
        }

        if(carry > 0) result.append(carry);

        return result.reverse().toString();
    }
}
