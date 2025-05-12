package medium.Stack;

import org.junit.Test;

public class EvalRPNTest {
    EvalRPN evalRPN = new EvalRPN();

    @Test
    public void testEvalRPN() {
        assert evalRPN.evalRPN(new String[]{"2", "1", "+", "3", "*"}) == 9;
        assert evalRPN.evalRPN(new String[]{"4", "13", "5", "/", "+"}) == 6;
        assert evalRPN.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}) == 22;
    }
}
