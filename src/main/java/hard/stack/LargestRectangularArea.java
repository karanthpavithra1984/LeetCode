package hard.stack;

import java.util.Stack;

public class LargestRectangularArea {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> heightStack = new Stack<>();
        int maxHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (!heightStack.isEmpty() && heights[i] <= heights[heightStack.peek()]) {
                //Remove the previous stack
                int index = heightStack.pop();
                int height = heights[index];
                //This is little tricky
                // if the value is empty , then the width is uptill the index.
                int width = heightStack.isEmpty() ? i : i - heightStack.peek() - 1;
                maxHeight = Math.max(maxHeight, height * width);
            }

            heightStack.push(i);
        }

        //Go through remaining now use the same logic as before
        while (!heightStack.isEmpty()) {
            int index = heightStack.pop();
            int height = heights[index];
            //If its empty then the width was smallest and we should calculate the length throught out the width
            int width = heightStack.isEmpty() ? heights.length : heights.length - heightStack.peek() - 1;
            maxHeight = Math.max(maxHeight, height * width);
        }

        return maxHeight;
    }
}
