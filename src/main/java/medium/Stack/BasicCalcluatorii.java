package medium.Stack;

import java.util.Stack;

public class BasicCalcluatorii {
    /**
     * Time Complexity o(n)
     * Space complexity o(n)
     *
     * @param s
     * @return
     */
    public int calculate(String s) {
        Stack<Integer> numberStack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (Character.isDigit(character)) {
                currentNumber = (currentNumber * 10) + (character - '0');
            }
            if ((character != 32 && !Character.isDigit(character)) || i + 1 == s.length()) {
                switch (operation) {
                    case '+' -> numberStack.push(currentNumber);
                    case '-' -> numberStack.push(-currentNumber);
                    case '*' -> numberStack.push(numberStack.pop() * currentNumber);
                    case '/' -> numberStack.push(numberStack.pop() / currentNumber);
                }
                operation = character;
                currentNumber = 0;
            }
        }

        int result = 0;

        while (!numberStack.isEmpty()) {
            result += numberStack.pop();
        }

        return result;

    }

}
