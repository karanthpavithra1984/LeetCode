package medium.Matrix;

import java.util.LinkedList;
import java.util.List;

/**
 * Refer to this
 * This is o(n*m)  n is the size of the nums and m is the size of the array of the nums
 * This is still going to be o(n*m)
 * Space is o(n*m)
 * <p>
 * https://leetcode.com/problems/diagonal-traverse-ii/solutions/4315398/logic-approach-explained-through-image-very-easy-and-short-code
 */

public class DiagonalTraverseII {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<List<Integer>> diagonalOrder = new LinkedList<>();
        int size = 0;
        for (int i = 0; i < nums.size(); i++) {
            int x = i;
            //Adds this to the multiple list.
            for (int j = 0; j < nums.get(i).size(); j++) {
                if (diagonalOrder.size() == x) {
                    //This is because the list is empty for the index, we need to add it.
                    diagonalOrder.add(new LinkedList<>());
                }
                diagonalOrder.get(x).addFirst(nums.get(i).get(j));
                x++;
                size++;
            }
        }

        int[] finalResult = new int[size];
        int index = 0;

        for (List<Integer> list : diagonalOrder) {
            for (Integer num : list) {
                finalResult[index++] = num;
            }
        }

        return finalResult;
    }
}
