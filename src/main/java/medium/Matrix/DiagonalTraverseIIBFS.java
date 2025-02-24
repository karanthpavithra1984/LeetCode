package medium.Matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DiagonalTraverseIIBFS {
    /**
     * Time Complexity o(n)
     * Space complexity half of it , since queue might have maximum over the diagonal, which is square root n
     * so square root of n
     * @param nums
     * @return
     */
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Queue<int[]> queue = new LinkedList<>();

        List<Integer> ans = new ArrayList<>();

        int row = 0;
        int col = 0;

        queue.add(new int[]{row, col});

        while(!queue.isEmpty()){
            int[] values = queue.poll();
            int curRow = values[0];
            int curCol = values[1];
            ans.add(nums.get(curRow).get(curCol));

            if(curCol == 0  && curRow + 1 < nums.size()){
                queue.add(new int[]{curRow + 1, curCol});
            }

            if(curCol+1 < nums.get(curRow).size()){
                queue.add(new int[]{curRow, curCol + 1});
            }

        }

        return ans.stream().mapToInt(i->i).toArray();
    }
}
