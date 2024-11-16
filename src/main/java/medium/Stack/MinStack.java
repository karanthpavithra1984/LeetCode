package medium.Stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if(minStack.isEmpty()){
            minStack.push(val);
        }else if(val <= minStack.peek()){
            minStack.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if(minStack.peek().intValue() == stack.peek().intValue()){
            minStack.pop();
            stack.pop();
        }else{
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
