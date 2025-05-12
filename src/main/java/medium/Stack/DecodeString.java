package medium.Stack;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int number = 0;

        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number = number * 10 + c - '0';
            } else if (c == '[') {
                numbers.push(number);
                number = 0; //reset the number
                stringStack.push(currentString);
                currentString = new StringBuilder(); // reset the current String
            } else if (c == ']') {
                int k = numbers.pop();
                StringBuilder decodedString = stringStack.pop();
                while (k > 0) {
                    decodedString.append(currentString);
                    k--;
                }
                currentString = decodedString;
            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();

    }
}
