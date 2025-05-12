package medium.Stack;

import java.util.Stack;

public class MinInsertions {
    public int minInsertions(String s) {
        Stack<Character> paranthStack = new Stack<>();

        int index = 0;
        int numOfInsertions = 0;
        while (index < s.length()) {
            char c = s.charAt(index);

            if (c == '(') {
                paranthStack.push(c);
            } else {
                //Character is ')'
                if (index + 1 < s.length() && s.charAt(index + 1) == ')') {
                    //Ideal condition
                    if (!paranthStack.isEmpty() && paranthStack.peek() == '(') {
                        paranthStack.pop();
                    } else {
                        numOfInsertions++;
                    }
                    index++;
                } else {
                    if (!paranthStack.isEmpty() && paranthStack.peek() == '(') {
                        paranthStack.pop();
                        numOfInsertions++;
                    } else {
                        numOfInsertions += 2;
                    }
                }
            }


            index++;
        }

        while (!paranthStack.isEmpty()) {
            numOfInsertions += 2;
            paranthStack.pop();
        }
        return numOfInsertions;
    }
}
