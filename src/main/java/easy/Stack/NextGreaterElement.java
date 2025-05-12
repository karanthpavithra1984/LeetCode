package easy.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //First find next greater element in nums2;
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> numGreaterElementMap = new HashMap<>();

        //Create a map of element and next greater element
        //Stack and map takes around o(1) for push and pop
        //o(n) for reading through the nums2
        //Space is o(n) for the elementMap, since we pop items of the stack
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                numGreaterElementMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        //Add the reamining elements from stack to map.
        //If they are left in the stack, that means they dont have next greater element
        while (!stack.isEmpty()) {
            numGreaterElementMap.put(stack.pop(), -1);
        }

        //I am doing in array modification, so no space here
        //But time is o(m)
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = numGreaterElementMap.get(nums1[i]);
        }

        return nums1;
    }
}
