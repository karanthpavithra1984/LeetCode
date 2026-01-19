package medium.BinaryTree;

import java.util.Stack;

public class PreOrder {
    public boolean verifyPreorder(int[] preorder) {
        Stack<Integer> stack = new Stack<>();

        int minValue = Integer.MIN_VALUE;

        for (int num : preorder) {
            // Going on and on to the left side, if you find a value top of the stack less than the num,
            //Back track it and choose the minValue
            while (!stack.isEmpty() && stack.peek() < num) {
                minValue = stack.pop();
            }

            //if num is less than the minValue in the tree,
            if (num <= minValue) {
                return false;
            }

            stack.push(num);
        }

        return true;
    }
}
