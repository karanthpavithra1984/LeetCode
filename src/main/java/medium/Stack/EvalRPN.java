package medium.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.BinaryOperator;

public class EvalRPN {

    /**
     * Time Complexity o(n)
     * Space Complexity o(1) - Token Stack is variable
     *
     * @param tokens
     * @return
     */

    public int evalRPN(String[] tokens) {
        //Define Operations first
        Map<String, BinaryOperator<Long>> binaryOperatorMap = new HashMap<>(Map.of(
                "+", ((aLong, aLong2) -> aLong + aLong2),
                "-", ((aLong, aLong2) -> aLong - aLong2),
                "*", ((aLong, aLong2) -> aLong * aLong2),
                "/", ((aLong, aLong2) -> aLong / aLong2)
        ));

        Stack<Long> tokenStack = new Stack<>();
        for (String s : tokens) {
            if (binaryOperatorMap.containsKey(s)) {
                Long number2 = tokenStack.pop();
                Long number1 = tokenStack.pop();

                tokenStack.push(binaryOperatorMap.get(s).apply(number1, number2));
            } else {
                tokenStack.push(Long.parseLong(s));
            }
        }

        return tokenStack.pop().intValue();
    }
}
