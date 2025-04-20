package medium.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.BinaryOperator;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Map<String, BinaryOperator<Long>> binaryOperatorMap
                = new HashMap<>();
        binaryOperatorMap.put("+", (((aLong, aLong2) -> aLong + aLong2)));
        binaryOperatorMap.put("-", (((aLong, aLong2) -> aLong - aLong2)));
        binaryOperatorMap.put("*", (((aLong, aLong2) -> aLong * aLong2)));
        binaryOperatorMap.put("/", (((aLong, aLong2) -> aLong/aLong2)));

        Stack<Long> valueStack = new Stack<>();

        for(String token: tokens){
            if(binaryOperatorMap.containsKey(token)){
                Long number2 =  valueStack.pop();
                Long number = valueStack.pop();

                valueStack.push(binaryOperatorMap.get(token).apply(number, number2));
            }else{
                valueStack.push(Long.valueOf(token));
            }
        }

        return valueStack.pop().intValue();
    }
}
