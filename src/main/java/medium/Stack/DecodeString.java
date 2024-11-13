package medium.Stack;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<StringBuilder> decodedString = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int number = 0;

        for(Character c: s.toCharArray()){
            if(Character.isDigit(c)){
                number = number * 10 + c - '0';
            }
        }

        return decodedString.toString();

    }
}
