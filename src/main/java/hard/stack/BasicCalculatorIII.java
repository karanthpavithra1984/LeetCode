package hard.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BasicCalculatorIII {
    int i = 0;

    public int calculate(String s) {
        i = 0;
        return calc(s);
    }

    private int calc(String s) {
        Deque<Integer> numberStack = new ArrayDeque<>();
        int num = 0;
        char op = '+';
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            }

            if (c == '(') {
                num = calc(s);
            }

            if ((c != 32 && !Character.isDigit(c)) || (i == s.length())) {
                switch (op) {
                    case '+' -> numberStack.push(num);
                    case '-' -> numberStack.push(-num);
                    case '*' -> numberStack.push(numberStack.pop() * num);
                    case '/' -> numberStack.push(numberStack.pop() / num);
                }
                op = c;
                num = 0;
            }


            if (c == ')') break;

        }

        int result = 0;

        while (!numberStack.isEmpty()) {
            result += numberStack.pop();
        }

        return result;
    }
}
