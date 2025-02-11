package medium.Stack;

import java.util.Stack;

public class StockSpanner {
    Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int counter = 1;
        while (!stack.isEmpty() && price >= stack.peek()[0]) {
            counter +=  stack.peek()[1];
            stack.pop();
        }
        stack.push(new int[]{price, counter});
        return counter;
    }
}
